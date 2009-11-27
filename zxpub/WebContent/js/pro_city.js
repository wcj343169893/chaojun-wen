function setProvince(selectIndex) {
	var provinceValue = new Array("未指定", "北京市","天津市","上海市","重庆市","河北省","山西省","台湾省","辽宁省","吉林省","黑龙江省","江苏省","浙江省","安徽省","福建省","江西省","山东省","河南省","湖北省","湖南省","广东省","甘肃省","四川省","贵州省","海南省","云南省","青海省","陕西省","广西壮族自治区","西藏自治区","宁夏回族自治区","新疆维吾尔自治区","内蒙古自治区","澳门特别行政区","香港特别行政区");
	var provinceObj = document.getElementById("province");
	provinceObj.options.length = 0;
	var option;
	for ( var i = 0; i < provinceValue.length; i++) {
	option = new Option(provinceValue[i], i);
	provinceObj.options.add(option);
	}
	provinceObj.selectedIndex = selectIndex;
}

function setCity(cityKey) {
	// 获得省份索引
	var provinceIndex = document.getElementById("province").value;
	provinceIndex = parseInt(provinceIndex);
	// 定义变量，代表下拉列表框的选项目(option)
	var cityValue;
	var cityIndex;
	// 根据省份创建不同的选项
	// new Option("显示的值", "value值")
	switch (provinceIndex) {
		case 0:
		var option;
		var city;
		option = new Option("未指定", 0);
		city = document.getElementById("city")
		city.options.length = 0;
		city.options.add(option);
		break;
		case 1:
		cityValue = "北京市";
		cityIndex = "1";
		addCity(cityValue, cityIndex);
		break;
		case 2:
		cityValue = "天津市";
		cityIndex = "2";
		addCity(cityValue, cityIndex);
		break;
		case 3:
		cityValue = "上海市";
		cityIndex = "3";
		addCity(cityValue, cityIndex);
		break;
		case 4:
		cityValue = "重庆市";
		cityIndex = "4";
		addCity(cityValue, cityIndex);
		break;
		case 5:
		cityValue = "石家庄市,唐山市,秦皇岛市,邯郸市,邢台市,保定市,张家口市,承德市,沧州市,廊坊市,衡水市";
		cityIndex = "5,6,7,8,9,10,11,12,13,14,15";
		addCity(cityValue, cityIndex);
		break;
		case 6:
		cityValue = "太原市,大同市,阳泉市,长治市,晋城市,朔州市,晋中市,运城市,忻州市,临汾市,吕梁市";
		cityIndex = "16,17,18,19,20,21,22,23,24,25,26";
		addCity(cityValue, cityIndex);
		break;
		case 7:
		cityValue = "台北市,高雄市,基隆市,台中市,台南市,新竹市,嘉义市,台北县,宜兰县,桃园县,新竹县,苗栗县,台中县,彰化县,南投县,云林县,嘉义县,台南县,高雄县,屏东县,澎湖县,台东县,花莲县";
		cityIndex = "27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49";
		addCity(cityValue, cityIndex);
		break;
		case 8:
		cityValue = "沈阳市,大连市,鞍山市,抚顺市,本溪市,丹东市,锦州市,营口市,阜新市,辽阳市,盘锦市,铁岭市,朝阳市,葫芦岛市";
		cityIndex = "50,51,52,53,54,55,56,57,58,59,60,61,62,63";
		addCity(cityValue, cityIndex);
		break;
		case 9:
		cityValue = "长春市,吉林市,四平市,辽源市,通化市,白山市,松原市,白城市,延边朝鲜族自治州";
		cityIndex = "64,65,66,67,68,69,70,71,72";
		addCity(cityValue, cityIndex);
		break;
		case 10:
		cityValue = "哈尔滨市,齐齐哈尔市,鹤岗市,双鸭山市,鸡西市,大庆市,伊春市,牡丹江市,佳木斯市,七台河市,黑河市,绥化市,大兴安岭地区";
		cityIndex = "73,74,75,76,77,78,79,80,81,82,83,84,85";
		addCity(cityValue, cityIndex);
		break;
		case 11:
		cityValue = "南京市,无锡市,徐州市,常州市,苏州市,南通市,连云港市,淮安市,盐城市,扬州市,镇江市,泰州市,宿迁市";
		cityIndex = "86,87,88,89,90,91,92,93,94,95,96,97,98";
		addCity(cityValue, cityIndex);
		break;
		case 12:
		cityValue = "杭州市,宁波市,温州市,嘉兴市,湖州市,绍兴市,金华市,衢州市,舟山市,台州市,丽水市";
		cityIndex = "99,100,101,102,103,104,105,106,107,108,109";
		addCity(cityValue, cityIndex);
		break;
		case 13:
		cityValue = "合肥市,芜湖市,蚌埠市,淮南市,马鞍山市,淮北市,铜陵市,安庆市,黄山市,滁州市,阜阳市,宿州市,巢湖市,六安市,亳州市,池州市,宣城市";
		cityIndex = "110,111,112,113,114,115,116,117,118,119,120,121,122,123,124,125,126";
		addCity(cityValue, cityIndex);
		break;
		case 14:
		cityValue = "福州市,厦门市,莆田市,三明市,泉州市,漳州市,南平市,龙岩市,宁德市";
		cityIndex = "127,128,129,130,131,132,133,134,135";
		addCity(cityValue, cityIndex);
		break;
		case 15:
		cityValue = "南昌市,景德镇市,萍乡市,九江市,新余市,鹰潭市,赣州市,吉安市,宜春市,抚州市,上饶市";
		cityIndex = "136,137,138,139,140,141,142,143,144,145,146";
		addCity(cityValue, cityIndex);
		break;
		case 16:
		cityValue = "济南市,青岛市,淄博市,枣庄市,东营市,烟台市,潍坊市,济宁市,泰安市,威海市,日照市,莱芜市,临沂市,德州市,聊城市,滨州市,菏泽市";
		cityIndex = "147,148,149,150,151,152,153,154,155,156,157,158,159,160,161,162,163";
		addCity(cityValue, cityIndex);
		break;
		case 17:
		cityValue = "郑州市,开封市,洛阳市,平顶山市,安阳市,鹤壁市,新乡市,焦作市,濮阳市,许昌市,漯河市,三门峡市,南阳市,商丘市,信阳市,周口市,驻马店市,济源市";
		cityIndex = "164,165,166,167,168,169,170,171,172,173,174,175,176,177,178,179,180,181";
		addCity(cityValue, cityIndex);
		break;
		case 18:
		cityValue = "武汉市,黄石市,十堰市,荆州市,宜昌市,襄樊市,鄂州市,荆门市,孝感市,黄冈市,咸宁市,随州市,仙桃市,天门市,潜江市,神农架林区,恩施土家族苗族自治州";
		cityIndex = "182,183,184,185,186,187,188,189,190,191,192,193,194,195,196,197,198";
		addCity(cityValue, cityIndex);
		break;
		case 19:
		cityValue = "长沙市,株洲市,湘潭市,衡阳市,邵阳市,岳阳市,常德市,张家界市,益阳市,郴州市,永州市,怀化市,娄底市,湘西土家族苗族自治州";
		cityIndex = "199,200,201,202,203,204,205,206,207,208,209,210,211,212";
		addCity(cityValue, cityIndex);
		break;
		case 20:
		cityValue = "广州市,深圳市,珠海市,汕头市,韶关市,佛山市,江门市,湛江市,茂名市,肇庆市,惠州市,梅州市,汕尾市,河源市,阳江市,清远市,东莞市,中山市,潮州市,揭阳市,云浮市";
		cityIndex = "213,214,215,216,217,218,219,220,221,222,223,224,225,226,227,228,229,230,231,232,233";
		addCity(cityValue, cityIndex);
		break;
		case 21:
		cityValue = "兰州市,金昌市,白银市,天水市,嘉峪关市,武威市,张掖市,平凉市,酒泉市,庆阳市,定西市,陇南市,临夏回族自治州,甘南藏族自治州";
		cityIndex = "234,235,236,237,238,239,240,241,242,243,244,245,246,247";
		addCity(cityValue, cityIndex);
		break;
		case 22:
		cityValue = "成都市,自贡市,攀枝花市,泸州市,德阳市,绵阳市,广元市,遂宁市,内江市,乐山市,南充市,眉山市,宜宾市,广安市,达州市,雅安市,巴中市,资阳市,阿坝藏族羌族自治州,甘孜藏族自治州,凉山彝族自治州";
		cityIndex = "248,249,250,251,252,253,254,255,256,257,258,259,260,261,262,263,264,265,266,267,268";
		addCity(cityValue, cityIndex);
		break;
		case 23:
		cityValue = "贵阳市,六盘水市,遵义市,安顺市,铜仁地区,毕节地区,黔西南布依族苗族自治州,黔东南苗族侗族自治州,黔南布依族苗族自治州";
		cityIndex = "269,270,271,272,273,274,275,276,277";
		addCity(cityValue, cityIndex);
		break;
		case 24:
		cityValue = "海口市,三亚市,五指山市,琼海市,儋州市,文昌市,万宁市,东方市,澄迈县,定安县,屯昌县,临高县,白沙黎族自治县,昌江黎族自治县,乐东黎族自治县,陵水黎族自治县,保亭黎族苗族自治县,琼中黎族苗族自治县";
		cityIndex = "278,279,280,281,282,283,284,285,286,287,288,289,290,291,292,293,294,295";
		addCity(cityValue, cityIndex);
		break;
		case 25:
		cityValue = "昆明市,曲靖市,玉溪市,保山市,昭通市,丽江市,思茅市,临沧市,文山壮族苗族自治州,红河哈尼族彝族自治州,西双版纳傣族自治州,楚雄彝族自治州,大理白族自治州,德宏傣族景颇族自治州,怒江傈傈族自治州,迪庆藏族自治州";
		cityIndex = "296,297,298,299,300,301,302,303,304,305,306,307,308,309,310,311";
		addCity(cityValue, cityIndex);
		break;
		case 26:
		cityValue = "西宁市,海东地区,海北藏族自治州,黄南藏族自治州,海南藏族自治州,果洛藏族自治州,玉树藏族自治州,海西蒙古族藏族自治州";
		cityIndex = "312,313,314,315,316,317,318,319";
		addCity(cityValue, cityIndex);
		break;
		case 27:
		cityValue = "西安市,铜川市,宝鸡市,咸阳市,渭南市,延安市,汉中市,榆林市,安康市,商洛市";
		cityIndex = "320,321,322,323,324,325,326,327,328,329";
		addCity(cityValue, cityIndex);
		break;
		case 28:
		cityValue = "南宁市,柳州市,桂林市,梧州市,北海市,防城港市,钦州市,贵港市,玉林市,百色市,贺州市,河池市,来宾市,崇左市";
		cityIndex = "330,331,332,333,334,335,336,337,338,339,340,341,342,343";
		addCity(cityValue, cityIndex);
		break;
		case 29:
		cityValue = "拉萨市,那曲地区,昌都地区,山南地区,日喀则地区,阿里地区,林芝地区";
		cityIndex = "344,345,346,347,348,349,350";
		addCity(cityValue, cityIndex);
		break;
		case 30:
		cityValue = "银川市,石嘴山市,吴忠市,固原市,中卫市";
		cityIndex = "351,352,353,354,355";
		addCity(cityValue, cityIndex);
		break;
		case 31:
		cityValue = "乌鲁木齐市,克拉玛依市,石河子市　,阿拉尔市,图木舒克市,五家渠市,吐鲁番市,阿克苏市,喀什市,哈密市,和田市,阿图什市,库尔勒市,昌吉市　,阜康市,米泉市,博乐市,伊宁市,奎屯市,塔城市,乌苏市,阿勒泰市";
		cityIndex = "356,357,358,359,360,361,362,363,364,365,366,367,368,369,370,371,372,373,374,375,376,377";
		addCity(cityValue, cityIndex);
		break;
		case 32:
		cityValue = "呼和浩特市,包头市,乌海市,赤峰市,通辽市,鄂尔多斯市,呼伦贝尔市,巴彦淖尔市,乌兰察布市,锡林郭勒盟,兴安盟,阿拉善盟";
		cityIndex = "378,379,380,381,382,383,384,385,386,387,388,389";
		addCity(cityValue, cityIndex);
		break;
		case 33:
		cityValue = "澳门特别行政区";
		cityIndex = "390";
		addCity(cityValue, cityIndex);
		break;
		case 34:
		cityValue = "香港特别行政区";
		cityIndex = "391";
		addCity(cityValue, cityIndex);
		break;
	}
	
	var cityIndexArray = new Array(0,1,1,1,1,1,2,3,4,5,6,7,8,9,10,11,1,2,3,4,5,6,7,8,9,10,11,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,1,2,3,4,5,6,7,8,9,10,11,12,13,14,1,2,3,4,5,6,7,8,9,1,2,3,4,5,6,7,8,9,10,11,12,13,1,2,3,4,5,6,7,8,9,10,11,12,13,1,2,3,4,5,6,7,8,9,10,11,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,1,2,3,4,5,6,7,8,9,1,2,3,4,5,6,7,8,9,10,11,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,1,2,3,4,5,6,7,8,9,10,11,12,13,14,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,1,2,3,4,5,6,7,8,9,10,11,12,13,14,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,1,2,3,4,5,6,7,8,9,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,1,2,3,4,5,6,7,8,1,2,3,4,5,6,7,8,9,10,1,2,3,4,5,6,7,8,9,10,11,12,13,14,1,2,3,4,5,6,7,1,2,3,4,5,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,1,2,3,4,5,6,7,8,9,10,11,12,1,1);
	document.getElementById("city").selectedIndex = cityIndexArray[cityKey];
}

function addCity(cityValue, cityIndex) {
	var cityValueArray = cityValue.split(",");
	var cityIndexArray = cityIndex.split(",");
	var city = document.getElementById("city");
	// 先把城市下拉框中的原有选项清空
	city.options.length = 0;
	var option;
	option = new Option("未指定", 0);
	city.options.add(option);
	for ( var i = 0; i < cityValueArray.length; i++) {
		option = new Option(cityValueArray[i], cityIndexArray[i]);
		city.options.add(option);
	}
}
