/**
 *******************************************************************************
 * JDomDemo.java
 *
 * (c) Copyright 2009 YangYan
 *
 *��������������
 *  JavaWeb(JavaWebʾ������)
 *�����ܸ�Ҫ��
 *  ��ʾDOM�����ɺͽ���XML�ĵ�
 *�����ߣ�
 *  ����
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
 * ��ʾDOM�����ɺͽ���XML�ĵ�
 * 
 * 
 * @author ����
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
	 * ��������XML�ļ�
	 * 
	 * 
	 * @return ���XML�ļ������в�������ELEMENT�ڵ��ELEMENT�ڵ��ֵ�ļ���
	 */
	public List<String> resolveEmpXML() {
		// ��ȡDocumentBuilderFactory�Ա����Ĵ����ȡDocumentBuilder
		DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory
				.newInstance();
		// ����DocumentBuilder�Ա����Ĵ����ȡDocument
		DocumentBuilder documentBuilder;
		// ����һ��Document��Document�൱�ڴ��XMLԪ�ص�ĸ��������
		Document document = null;
		// ����һ��InputStream
		InputStream inputStream = null;
		try {
			// ��ȡdocumentBuilder
			documentBuilder = documentBuilderFactory.newDocumentBuilder();
			// ʵ����InputStream,���ڴ�c:/a.xml�ļ��ж�������,�Ա����ǽ����ݷŵ�document��
			inputStream = new FileInputStream("c:/a.xml");
			// ����documentBuilder��parse�����������ݴ��ļ���ȡ�����ŵ�document��
			document = documentBuilder.parse(inputStream);
			// �ر��ļ������ͷ���Դ
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
		// ��ȡdocument�е�ȫ�����ݡ������õ���ȫ������ʵ���Ͼ���һ�����ڵ㡣
		Element root = document.getDocumentElement();
		// ʵ����һ�����ڴ��XML�ļ������в�������ELEMENT�ڵ��ELEMENT�ڵ��ֵ�ļ���
		List<String> valueList = new ArrayList<String>();
		// ����recursionNode�����ݹ������XML�ļ������в�������ELEMENT�ڵ��ELEMENT�ڵ��ֵ������ֵ�ŵ�������
		recursionNode(root, valueList);
		// ���ؼ���
		return valueList;
	}

	/**
	 * �ݹ����XML�ļ�(�˷����Լ����ɣ���������˵�������)
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
	 * �жϽڵ��Ƿ�����¼���ELEMENT�ڵ�
	 * 
	 *
	 * @param root ���ڵ�
	 * @return true: ���� false:������
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
	 * ����Emp�е�ֵ����XML�ļ���
	 * 
	 *
	 */
	public void createEmpXML() {
		// ����һ���ź�ֵ��Emp��������������XML����
		Emp emp = this.setEmp();
		// ���Ǳ������������������Ҫ��ӵ�XML�ڵ㣬Ȼ���ٰ�������Ķ���д���ļ��С�
		Document document = this.setEmpDocument(emp);
		// ʵ����һ��DOMSource�����乹�췽���н�document������й���
		DOMSource domSource = new DOMSource(document);
		// ʵ����һ��File��ָ��C:/a.xml
		File file = new File("C:/a.xml");
		// ����һ���ļ�������
		FileOutputStream fileOutputStream;
		try {
			// ����ָ��C:/a.xml��Fileʵ���ļ���
			fileOutputStream = new FileOutputStream(file);
			// ͨ���ļ���ʵ����һ��StreamResult,��������д��xml�����ļ��С�
			StreamResult streamResult = new StreamResult(fileOutputStream);
			// ��ȡһ��TransformerFactory��ʵ�������ڻ�ȡTransformer��ʵ��
			TransformerFactory transformerFactory = TransformerFactory
					.newInstance();
			// ��ȡTransformer��ʵ��
			Transformer transformer = transformerFactory.newTransformer();
			// �����������ɵ�xml�ļ��ı���ΪUTF-8
			transformer.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
			//�������ʱ�Ƿ���и�ʽ��(�������õ�Ҫ���и�ʽ��)
			transformer.setOutputProperty(OutputKeys.INDENT, "yes");
			// ����transform��������XML�ļ�
			transformer.transform(domSource, streamResult);
			// �ر��ļ���
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
	 * ����һ���ź�ֵ��Emp��������������XML����
	 * 
	 * 
	 * @return ����õ�Emp����
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
	 * �������emp�е�ֵ���õ����ɵ�Document�У�������Document
	 * 
	 *
	 * @param emp
	 * @return
	 */
	private Document setEmpDocument(Emp emp) {
		// Ա�����
		Integer empno = emp.getEmpno();
		// Ա������
		String ename = emp.getEname();
		// ����������Ϣ
		Dept dept = emp.getDept();
		// ���ű��(�¼�����Ϣ)
		Integer deptno = dept.getDeptno();
		// ��������(�¼�����Ϣ)
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
	 * ��ʾ�޸�document�е�dnameNode�ڵ�
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
