/**
 *******************************************************************************
 * JDomDemo.java
 *
 * (c) Copyright 2009 YangYan
 *
 *＜所属工程名＞
 *  JavaWeb(JavaWeb示例工程)
 *＜功能概要＞
 *  演示DOM中生成和解析XML文档
 *＜作者＞
 *  杨砚
 *******************************************************************************
 */
package com.zuxia.chapter1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/**
 * 演示DOM中生成和解析XML文档
 * 
 * 
 * @author 杨砚
 */
public class JDomDemo {
	public static void main(String[] args) {
		JDomDemo jDomDemo = new JDomDemo();
		jDomDemo.createEmpXML();
		List<String> valueList = jDomDemo.resolveEmpXML();
		for (int i = 0; i < valueList.size(); i++) {
			System.out.println(valueList.get(i));
		}
	}

	/**
	 * 解析遍历XML文件
	 * 
	 * 
	 * @return 存放XML文件中所有不包含子ELEMENT节点的ELEMENT节点的值的集合
	 */
	public List<String> resolveEmpXML() {
		// 获取DocumentBuilderFactory以便后面的代码获取DocumentBuilder
		DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory
				.newInstance();
		// 声明DocumentBuilder以便后面的代码获取Document
		DocumentBuilder documentBuilder;
		// 声明一个Document。Document相当于存放XML元素的母体容器。
		Document document = null;
		// 声明一个InputStream
		InputStream inputStream = null;
		try {
			// 获取documentBuilder
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
			// 实例化InputStream,用于从c:/a.xml文件中读出内容,以便我们将内容放到document中
			inputStream = new FileInputStream("c:/a.xml");
			// 调用documentBuilder的parse方法，将内容从文件里取出并放到document中
			document = documentBuilder.parse(inputStream);
			// 关闭文件流以释放资源
			inputStream.close();
		} catch (ParserConfigurationException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (SAXException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		// 获取document中的全部内容。这里拿到的全部内容实际上就是一个根节点。
		Element root = document.getDocumentElement();
		// 实例化一个用于存放XML文件中所有不包含子ELEMENT节点的ELEMENT节点的值的集合
		List<String> valueList = new ArrayList<String>();
		// 调用recursionNode方法递归遍历出XML文件中所有不包含子ELEMENT节点的ELEMENT节点的值，并将值放到集合中
		recursionNode(root, valueList);
		// 返回集合
		return valueList;
	}

	/**
	 * 递归遍历XML文件(此方法自己理解吧！！文字是说不清楚的)
	 * 
	 *
	 * @param root
	 * @param valueList
	 */
	private void recursionNode(Node root, List<String> valueList) {
		Node firstChildNode = root.getFirstChild();
		List<Node> parentNodeList = new ArrayList<Node>();
		if (firstChildNode.getNodeType() == Node.ELEMENT_NODE) {
			parentNodeList.add(firstChildNode);
		}
		Node nextSibling = firstChildNode.getNextSibling();
		while (nextSibling != null) {
			if (nextSibling.getNodeType() == Node.ELEMENT_NODE) {
				parentNodeList.add(nextSibling);
			}

			if (!this.isContainElementNode(nextSibling)
					&& nextSibling.getTextContent() != null
					&& !nextSibling.getTextContent().equals("")
					&& !nextSibling.getTextContent().equals("\n")) {
				valueList.add(nextSibling.getTextContent());
			}

			nextSibling = nextSibling.getNextSibling();
		}
		if (parentNodeList != null) {
			for (int i = 0; i < parentNodeList.size(); i++) {
				Node parentNode = parentNodeList.get(i);
				this.recursionNode(parentNode, valueList);
			}
		}
	}

	/**
	 * 判断节点是否包含下级子ELEMENT节点
	 * 
	 *
	 * @param root 根节点
	 * @return true: 包含 false:不包含
	 */
	private boolean isContainElementNode(Node root) {
		boolean result = false;
		Node childNode = root.getFirstChild();
		while (childNode != null && !result) {
			result = childNode.getNodeType() == Node.ELEMENT_NODE;
			childNode = childNode.getNextSibling();
		}

		return result;
	}

	/**
	 * 根据Emp中的值创建XML文件。
	 * 
	 *
	 */
	public void createEmpXML() {
		// 构造一个放好值的Emp对象，以用于生成XML代码
		Emp emp = this.setEmp();
		// 我们必须先向它里面添加需要添加的XML节点，然后再把它里面的东西写到文件中。
		Document document = this.setEmpDocument(emp);
		// 实例化一个DOMSource。在其构造方法中将document与其进行关联
		DOMSource domSource = new DOMSource(document);
		// 实例化一个File，指向C:/a.xml
		File file = new File("C:/a.xml");
		// 声明一个文件流对象
		FileOutputStream fileOutputStream;
		try {
			// 利用指向C:/a.xml的File实例文件流
			fileOutputStream = new FileOutputStream(file);
			// 通过文件流实例化一个StreamResult,用于最终写到xml物理文件中。
			StreamResult streamResult = new StreamResult(fileOutputStream);
			// 获取一个TransformerFactory的实例，用于获取Transformer的实例
			TransformerFactory transformerFactory = TransformerFactory
					.newInstance();
			// 获取Transformer的实例
			Transformer transformer = transformerFactory.newTransformer();
			// 设置最终生成的xml文件的编码为UTF-8
			transformer.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
			//设置输出时是否进行格式化(这里设置的要进行格式化)
			transformer.setOutputProperty(OutputKeys.INDENT, "yes");
			// 调用transform方法生成XML文件
			transformer.transform(domSource, streamResult);
			// 关闭文件流
			fileOutputStream.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (TransformerConfigurationException e) {
			e.printStackTrace();
		} catch (TransformerException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * 构造一个放好值的Emp对象，以用于生成XML代码
	 * 
	 * 
	 * @return 构造好的Emp对象
	 */
	private Emp setEmp() {
		Dept dept = new Dept();
		dept.setDeptno(10);
		dept.setDname("ACCOUNTING");

		Emp emp = new Emp();
		emp.setEmpno(7782);
		emp.setEname("CLARK");
		emp.setDept(dept);
		return emp;
	}

	/**
	 * 将传入的emp中的值设置到生成的Document中，并返回Document
	 * 
	 *
	 * @param emp
	 * @return
	 */
	private Document setEmpDocument(Emp emp) {
		// 员工编号
		Integer empno = emp.getEmpno();
		// 员工姓名
		String ename = emp.getEname();
		// 所属部门信息
		Dept dept = emp.getDept();
		// 部门编号(下级子信息)
		Integer deptno = dept.getDeptno();
		// 部门名称(下级子信息)
		String dname = dept.getDname();

		Document document = null;
		DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory
				.newInstance();
		DocumentBuilder documentBuilder = null;
		try {
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
		} catch (ParserConfigurationException e) {
			e.printStackTrace();
		}
		document = documentBuilder.newDocument();

		Node root = document.createElement("root");

		Node empnoNode = document.createElement("empnoNode");
		empnoNode.setTextContent(String.valueOf(empno));
		root.appendChild(empnoNode);

		Node enameNode = document.createElement("enameNode");
		enameNode.setTextContent(String.valueOf(ename));
		root.appendChild(enameNode);

		Node deptnoNode = document.createElement("deptnoNode");
		deptnoNode.setTextContent(String.valueOf(deptno));

		Node dnameNode = document.createElement("dnameNode");
		dnameNode.setTextContent(String.valueOf(dname));

		Node deptNode = document.createElement("deptNode");
		deptNode.appendChild(deptnoNode);
		deptNode.appendChild(dnameNode);
		root.appendChild(deptNode);

		document.appendChild(root);

		this.modifyNode(document);
		return document;
	}

	/**
	 * 演示修改document中的dnameNode节点
	 * 
	 *
	 * @param document
	 */
	private void modifyNode(Document document) {
		NodeList nodeList = document.getElementsByTagName("dnameNode");
		Node dnameNode = nodeList.item(0);
		dnameNode.setTextContent("sall");
	}
}
