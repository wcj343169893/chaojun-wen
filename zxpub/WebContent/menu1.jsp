<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>菜单</title>
<style>
.jqueryslidemenu {
	font: bold 12px Verdana;
	background: #414141;
	width: 100%;
}

.jqueryslidemenu ul {
	margin: 0;
	padding: 0;
	list-style-type: none;
}

/*Top level list items*/
.jqueryslidemenu ul li {
	position: relative;
	display: inline;
	float: left;
}

/*Top level menu link items style*/
.jqueryslidemenu ul li a {
	display: block;
	background: #414141; /*background of tabs (default state)*/
	color: white;
	padding: 8px 10px;
	border-right: 1px solid #778;
	color: #2d2b2b;
	text-decoration: none;
}

* html .jqueryslidemenu ul li a {
	/*IE6 hack to get sub menu links to behave correctly*/
	display: inline-block;
}

.jqueryslidemenu ul li a:link,.jqueryslidemenu ul li a:visited {
	color: white;
}

.jqueryslidemenu ul li a:hover {
	background: black; /*tab link background during hover state*/
	color: white;
}

/*1st sub level menu*/
.jqueryslidemenu ul li ul {
	position: absolute;
	left: 0;
	display: block;
	visibility: hidden;
}

/*Sub level menu list items (undo style from Top level List Items)*/
.jqueryslidemenu ul li ul li {
	display: list-item;
	float: none;
}

/*All subsequent sub menu levels vertical offset after 1st level sub menu */
.jqueryslidemenu ul li ul li ul {
	top: 0;
}

/* Sub level menu links style */
.jqueryslidemenu ul li ul li a {
	font: normal 13px Verdana;
	width: 160px; /*width of sub menus*/
	padding: 5px;
	margin: 0;
	border-top-width: 0;
	border-bottom: 1px solid gray;
}

.jqueryslidemenuz ul li ul li a:hover { /*sub menus hover style*/
	background: #eff9ff;
	color: black;
}

/* ######### CSS classes applied to down and right arrow images ######### */
.downarrowclass {
	position: absolute;
	top: 12px;
	right: 7px;
}

.rightarrowclass {
	position: absolute;
	top: 6px;
	right: 5px;
}
</style>
</head>
<body>
<!--[if lte IE 7]>
<style type="text/css">
html .jqueryslidemenu{height: 1%;} /*Holly Hack for IE7 and below*/
</style>
<![endif]-->
<script type="text/javascript"
	src="http://ajax.googleapis.com/ajax/libs/jquery/1.2.6/jquery.min.js"></script>
<script>
	/*********************
	 //* jQuery Multi Level CSS Menu #2- By Dynamic Drive: http://www.dynamicdrive.com/
	 //* Last update: Nov 7th, 08': Limit # of queued animations to minmize animation stuttering
	 //* Menu avaiable at DD CSS Library: http://www.dynamicdrive.com/style/
	 *********************/
	//Specify full URL to down and right arrow images (23 is padding-right to add to top level LIs with drop downs):
	var arrowimages = {
		down : [ 'downarrowclass',
				'http://www.cnzzad.com/photo/tx/css/down.gif', 23 ],
		right : [ 'rightarrowclass',
				'http://www.cnzzad.com/photo/tx/css/right.gif' ]
	}
	var jqueryslidemenu ={
		animateduration : {
			over : 200,
			out : 100
		}, //duration of slide in/ out animation, in milliseconds
		buildmenu : function(menuid, arrowsvar) {
			jQuery(document)
					.ready(
							function($) {
								var $mainmenu = $("#" + menuid + ">ul")
								var $headers = $mainmenu.find("ul").parent()
								$headers
										.each(function(i) {
											var $curobj = $(this)
											var $subul = $(this).find(
													'ul:eq(0)')
											this._dimensions = {
												w : this.offsetWidth,
												h : this.offsetHeight,
												subulw : $subul.outerWidth(),
												subulh : $subul.outerHeight()
											}
											this.istopheader = $curobj
													.parents("ul").length == 1 ? true
													: false
											$subul
													.css( {
														top : this.istopheader ? this._dimensions.h
																+ "px"
																: 0
													})
											$curobj
													.children("a:eq(0)")
													.css(
															this.istopheader ? {
																paddingRight : arrowsvar.down[2]
															}
																	: {})
													.append(
															'<img src="'
																	+ (this.istopheader ? arrowsvar.down[1]
																			: arrowsvar.right[1])
																	+ '" class="'
																	+ (this.istopheader ? arrowsvar.down[0]
																			: arrowsvar.right[0])
																	+ '" style="border:0;" />')
											$curobj
													.hover(
															function(e) {
																var $targetul = $(
																		this)
																		.children(
																				"ul:eq(0)")
																this._offsets = {
																	left : $(
																			this)
																			.offset().left,
																	top : $(
																			this)
																			.offset().top
																}
																var menuleft = this.istopheader ? 0
																		: this._dimensions.w
																menuleft = (this._offsets.left
																		+ menuleft
																		+ this._dimensions.subulw > $(
																		window)
																		.width()) ? (this.istopheader ? -this._dimensions.subulw
																		+ this._dimensions.w
																		: -this._dimensions.w)
																		: menuleft
																if ($targetul
																		.queue().length <= 1) //if 1 or less queued animations
																	$targetul
																			.css(
																					{
																						left : menuleft
																								+ "px",
																						width : this._dimensions.subulw + 'px'
																					})
																			.slideDown(
																					jqueryslidemenu.animateduration.over)
															},
															function(e) {
																var $targetul = $(
																		this)
																		.children(
																				"ul:eq(0)")
																$targetul
																		.slideUp(jqueryslidemenu.animateduration.out)
															}) //end hover
										}) //end $headers.each()
								$mainmenu.find("ul").css( {
									display : 'none',
									visibility : 'visible'
								})
							}) //end document.ready
		}
	}
	//build menu with ID="myslidemenu" on page:
	jqueryslidemenu.buildmenu("myslidemenu", arrowimages);
</script>
<body>
<div id="myslidemenu" class="jqueryslidemenu">
<ul>
	<li><a href="http://www.cnzzad.com">Item 1</a></li>
	<li><a href="#">Item 2</a></li>
	<li><a href="#">Folder 1</a>
	<ul>
		<li><a href="#">Sub Item 1.1</a></li>
		<li><a href="#">Sub Item 1.2</a></li>
		<li><a href="#">Sub Item 1.3</a></li>
		<li><a href="#">Sub Item 1.4</a></li>
	</ul>
	</li>
	<li><a href="#">Item 3</a></li>
	<li><a href="#">Folder 2</a>
	<ul>
		<li><a href="#">Sub Item 2.1</a></li>
		<li><a href="#">Folder 2.1</a>
		<ul>
			<li><a href="#">Sub Item 2.1.1</a></li>
			<li><a href="#">Sub Item 2.1.2</a></li>
			<li><a href="#">Folder 3.1.1</a>
			<ul>
				<li><a href="#">Sub Item 3.1.1.1</a></li>
				<li><a href="#">Sub Item 3.1.1.2</a></li>
				<li><a href="#">Sub Item 3.1.1.3</a></li>
				<li><a href="#">Sub Item 3.1.1.4</a></li>
				<li><a href="#">Sub Item 3.1.1.5</a></li>
			</ul>
			</li>
			<li><a href="http://www.cnzzad.com">Sub Item 2.1.4</a></li>
		</ul>
		</li>
	</ul>
	</li>
	<li><a href=http://www.cnzzad.com>Item 4</a></li>
</ul>
<br style="clear: left" />
</div>
</body>
</html>