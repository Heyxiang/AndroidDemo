package com.seventeen.plus.bean;

import java.util.List;

/**
 * Created by Administrator on 2015/11/6.
 */
public class IndexBannerBean {

	/**
	 * status : 0 data :
	 * {"adlet":[{"_id":"5636ebd20cf2248d18bc2b18","cityId":1,"endTime"
	 * :1448294400000
	 * ,"img":"fe509d4f81f34e15ee624bf14532fa56.jpg","modified":1446439890399
	 * ,"name":"青春专场","startTime":1446393600000,"subtitle":"摇滚不死    梦想依旧","to":
	 * "5636ebc90cf2248d18bc2b17"
	 * ,"type":"theme"},{"_id":"562206f30cf2e5b9d22e8f38"
	 * ,"cityId":1,"endTime":1447167600000
	 * ,"img":"2a169c73efef07a457262146c68149ca.jpg"
	 * ,"modified":1446092020990,"name"
	 * :"11.11脱单指南","startTime":1445011200000,"subtitle"
	 * :"少年我只能帮你到这里了","to":"562dce1e0cf285403146412f"
	 * ,"type":"theme"},{"_id":"5622075e0cf2e5b9d22e8f39"
	 * ,"cityId":1,"endTime":1447081200000
	 * ,"img":"6bf1bf7679fc24eb8df10207858377c9.jpg"
	 * ,"modified":1446091791328,"name"
	 * :"家有萌娃","startTime":1445011200000,"subtitle"
	 * :"成长快乐小小童军","to":"562469360cf2e5b9d22e8f3c"
	 * ,"type":"theme"},{"_id":"5631931e0cf28099d0ff40f3"
	 * ,"cityId":1,"endTime":1452355200000
	 * ,"img":"db944b0a5939673d722fa6a1135a7526.jpg"
	 * ,"modified":1446089502374,"name"
	 * :"温暖一冬","startTime":1446048000000,"subtitle"
	 * :"养生温泉","to":"https://m.108tian.com/act/topic/56309e2c0cf28099d0ff40e2"
	 * ,"type"
	 * :"outapp"}],"cityId":1,"openCity":{"北京":[{"id":1,"name":"北京","isHot"
	 * :true,
	 * "city":"beijing"}],"重庆":[{"id":6584,"name":"重庆","city":"chongqing"}]
	 * ,"四川":
	 * [{"id":6514,"name":"成都","city":"chengdu"}],"广东":[{"id":6281,"name":"深圳"
	 * ,"city"
	 * :"shenzhen"},{"id":6270,"name":"广州","city":"guangzhou"},{"id":6277,
	 * "name":
	 * "清远","city":"qingyuan"},{"id":6278,"name":"汕头","city":"shantou"},{"id"
	 * :6279
	 * ,"name":"汕尾","city":"shanwei"},{"id":6285,"name":"肇庆","city":"zhaoqing"
	 * },{"id":6272,"name":"惠州","city":"huizhou"},{"id":6269,"name":"佛山","city":
	 * "foshan"
	 * },{"id":6268,"name":"东莞","city":"dongguan"},{"id":6267,"name":"潮州"
	 * ,"city":
	 * "chaozhou"},{"id":6271,"name":"河源","city":"heyuan"},{"id":6275,"name"
	 * :"茂名"
	 * ,"city":"maoming"},{"id":6282,"name":"阳江","city":"yangjiang"},{"id":6273
	 * ,"name"
	 * :"江门","city":"jiangmen"},{"id":6280,"name":"韶关","city":"shaoguan"},
	 * {"id":6287
	 * ,"name":"珠海","city":"zhuhai"},{"id":6286,"name":"中山","city":"zhongshan"
	 * },{"id":6283,"name":"云浮","city":"yunfu"},{"id":6284,"name":"湛江","city":
	 * "zhanjiang"
	 * },{"id":6274,"name":"揭阳","city":"jieyang"},{"id":6276,"name":"梅州"
	 * ,"city":"meizhou"
	 * }],"浙江":[{"id":6575,"name":"嘉兴","city":"jiaxing"},{"id":6573
	 * ,"name":"杭州","isHot"
	 * :true,"city":"hangzhou"},{"id":6579,"name":"绍兴","city"
	 * :"shaoxing"},{"id":6582
	 * ,"name":"舟山","city":"zhoushan"},{"id":6576,"name":"金华"
	 * ,"city":"jinhua"},{"id"
	 * :6580,"name":"台州","city":"taizhou"},{"id":6577,"name"
	 * :"丽水","city":"lishui"
	 * },{"id":6574,"name":"湖州","city":"huzhou"},{"id":6583,
	 * "name":"衢州","city":"quzhou"
	 * },{"id":6581,"name":"温州","city":"wenzhou"},{"id"
	 * :6578,"name":"宁波","city":"ningbo"
	 * }],"天津":[{"id":6533,"name":"天津","city":"tianjin"
	 * }],"江苏":[{"id":6416,"name"
	 * :"苏州","city":"suzhou"},{"id":6419,"name":"无锡","city"
	 * :"wuxi"},{"id":6414,"name"
	 * :"南京","isHot":true,"city":"nanjing"},{"id":6415,
	 * "name":"南通","city":"nantong"
	 * },{"id":6422,"name":"扬州","city":"yangzhou"},{"id"
	 * :6411,"name":"常州","city":
	 * "changzhou"},{"id":6420,"name":"徐州","city":"xuzhou"
	 * },{"id":6418,"name":"泰州"
	 * ,"city":"taizhoushi"},{"id":6413,"name":"连云港","city"
	 * :"lianyungang"},{"id":
	 * 6421,"name":"盐城","city":"yancheng"},{"id":6417,"name"
	 * :"宿迁","city":"suqian"
	 * }],"河北":[{"id":6337,"name":"唐山","city":"tangshan"},{"id"
	 * :6335,"name":"秦皇岛"
	 * ,"city":"qinhuangdao"},{"id":6331,"name":"承德","city":"chengde"
	 * },{"id":6339
	 * ,"name":"张家口","city":"zhangjiakou"},{"id":6334,"name":"廊坊","city"
	 * :"langfang"
	 * },{"id":6329,"name":"保定","city":"baoding"},{"id":6336,"name":"石家庄"
	 * ,"city":
	 * "shijiazhuang"}],"广西":[{"id":6298,"name":"南宁","city":"nanning"}],"福建"
	 * :[{"id":6244,"name":"福州","city":"fuzhou"},{"id":6251,"name":"厦门","city":
	 * "xiamen"
	 * },{"id":6249,"name":"泉州","city":"quanzhou"}],"吉林":[{"id":6404,"name"
	 * :"长春",
	 * "city":"changchun"},{"id":6405,"name":"吉林","city":"jilin"}],"海南":[{"id"
	 * :6317,"name":"海口","city":"haikou"}],"云南":[{"id":6563,"name":"昆明","city":
	 * "kunming"
	 * }],"上海":[{"id":6511,"name":"上海","isHot":true,"city":"shanghai"}],
	 * "湖北":[{"id"
	 * :6382,"name":"武汉","city":"wuhan"},{"id":6387,"name":"宜昌","city"
	 * :"yichang"}
	 * ],"江西":[{"id":6429,"name":"南昌","city":"nanchang"}],"湖南":[{"id":
	 * 6389,"name":"长沙","city":"changsha"}],"河南":[{"id":6353,"name":"郑州","city":
	 * "zhengzhou"
	 * },{"id":6345,"name":"洛阳","city":"luoyang"}],"山东":[{"id":6482,"name"
	 * :"青岛","city"
	 * :"qingdao"},{"id":6487,"name":"烟台","city":"yantai"},{"id":6484
	 * ,"name":"泰安"
	 * ,"city":"taian"},{"id":6477,"name":"济南","city":"jinan"},{"id":
	 * 6486,"name":
	 * "潍坊","city":"weifang"},{"id":6481,"name":"临沂","city":"linyi"},
	 * {"id":6485,"name"
	 * :"威海","city":"weihai"}],"贵州":[{"id":6304,"name":"贵阳","city"
	 * :"guiyang"}],"安徽"
	 * :[{"id":6232,"name":"合肥","city":"hefei"},{"id":6240,"name"
	 * :"芜湖","city":"wuhu"
	 * }],"陕西":[{"id":6507,"name":"西安","city":"xian"}],"辽宁":[{
	 * "id":6438,"name":"大连"
	 * ,"city":"dalian"},{"id":6446,"name":"沈阳","city":"shenyang"
	 * },{"id":6442,"name"
	 * :"葫芦岛","city":"huludao"},{"id":6443,"name":"锦州","city":
	 * "jinzhou"},{"id":6439
	 * ,"name":"丹东","city":"dandong"},{"id":6445,"name":"盘锦"
	 * ,"city":"panjin"},{"id"
	 * :6448,"name":"营口","city":"yingkou"}],"山西":[{"id":6497
	 * ,"name":"太原","city":"taiyuan"
	 * },{"id":6493,"name":"晋中","city":"jinzhong"},{
	 * "id":6499,"name":"阳泉","city":
	 * "yangquan"}],"黑龙江":[{"id":6360,"name":"哈尔滨","city"
	 * :"harbin"}]},"indexWhat"
	 * :[{"name":"爬山","url":"/beijing/dest/scenery_0-2","id"
	 * :2},{"name":"赏花","url"
	 * :"/beijing/dest/scenery_0-6","id":6},{"name":"踏青","url"
	 * :"/beijing/dest/scenery_0-7"
	 * ,"id":7},{"name":"古镇","url":"/beijing/dest/scenery_0-29"
	 * ,"id":29},{"name":
	 * "人文","url":"/beijing/dest/scenery_0-23","id":23},{"name"
	 * :"公园","url":"/beijing/dest/scenery_0-25"
	 * ,"id":25}],"cityName":"北京","indexBanner"
	 * :[{"name":"","img":"9527a533c8139fd1345df4b77f0a8237.jpg"
	 * ,"eventName":"hongye"
	 * ,"modified":1446518366238,"id":"56337adf0cf2248d18bc2afc"
	 * ,"type":"recommend","to":"56381e4d0cf2248d18bc2b1d"},{"name":"","img":
	 * "d21858828ef7b7b757e1cfab4aee9774.jpg"
	 * ,"eventName":"book","modified":1441973113460
	 * ,"id":"55f2c37f0cf2b777cb4ecd7a"
	 * ,"type":"recommend","to":"556427de0cf222259208bc6b"}]} msg : OK
	 */

	private int status;
	/**
	 * adlet :
	 * [{"_id":"5636ebd20cf2248d18bc2b18","cityId":1,"endTime":1448294400000
	 * ,"img"
	 * :"fe509d4f81f34e15ee624bf14532fa56.jpg","modified":1446439890399,"name"
	 * :"青春专场","startTime":1446393600000,"subtitle":"摇滚不死    梦想依旧","to":
	 * "5636ebc90cf2248d18bc2b17"
	 * ,"type":"theme"},{"_id":"562206f30cf2e5b9d22e8f38"
	 * ,"cityId":1,"endTime":1447167600000
	 * ,"img":"2a169c73efef07a457262146c68149ca.jpg"
	 * ,"modified":1446092020990,"name"
	 * :"11.11脱单指南","startTime":1445011200000,"subtitle"
	 * :"少年我只能帮你到这里了","to":"562dce1e0cf285403146412f"
	 * ,"type":"theme"},{"_id":"5622075e0cf2e5b9d22e8f39"
	 * ,"cityId":1,"endTime":1447081200000
	 * ,"img":"6bf1bf7679fc24eb8df10207858377c9.jpg"
	 * ,"modified":1446091791328,"name"
	 * :"家有萌娃","startTime":1445011200000,"subtitle"
	 * :"成长快乐小小童军","to":"562469360cf2e5b9d22e8f3c"
	 * ,"type":"theme"},{"_id":"5631931e0cf28099d0ff40f3"
	 * ,"cityId":1,"endTime":1452355200000
	 * ,"img":"db944b0a5939673d722fa6a1135a7526.jpg"
	 * ,"modified":1446089502374,"name"
	 * :"温暖一冬","startTime":1446048000000,"subtitle"
	 * :"养生温泉","to":"https://m.108tian.com/act/topic/56309e2c0cf28099d0ff40e2"
	 * ,"type":"outapp"}] cityId : 1 openCity :
	 * {"北京":[{"id":1,"name":"北京","isHot"
	 * :true,"city":"beijing"}],"重庆":[{"id":6584
	 * ,"name":"重庆","city":"chongqing"}]
	 * ,"四川":[{"id":6514,"name":"成都","city":"chengdu"
	 * }],"广东":[{"id":6281,"name":"深圳"
	 * ,"city":"shenzhen"},{"id":6270,"name":"广州",
	 * "city":"guangzhou"},{"id":6277,
	 * "name":"清远","city":"qingyuan"},{"id":6278,"name"
	 * :"汕头","city":"shantou"},{"id"
	 * :6279,"name":"汕尾","city":"shanwei"},{"id":6285
	 * ,"name":"肇庆","city":"zhaoqing"
	 * },{"id":6272,"name":"惠州","city":"huizhou"},{
	 * "id":6269,"name":"佛山","city":"foshan"
	 * },{"id":6268,"name":"东莞","city":"dongguan"
	 * },{"id":6267,"name":"潮州","city":
	 * "chaozhou"},{"id":6271,"name":"河源","city":
	 * "heyuan"},{"id":6275,"name":"茂名"
	 * ,"city":"maoming"},{"id":6282,"name":"阳江",
	 * "city":"yangjiang"},{"id":6273,"name"
	 * :"江门","city":"jiangmen"},{"id":6280,"name"
	 * :"韶关","city":"shaoguan"},{"id":6287
	 * ,"name":"珠海","city":"zhuhai"},{"id":6286
	 * ,"name":"中山","city":"zhongshan"},{
	 * "id":6283,"name":"云浮","city":"yunfu"},{"id"
	 * :6284,"name":"湛江","city":"zhanjiang"
	 * },{"id":6274,"name":"揭阳","city":"jieyang"
	 * },{"id":6276,"name":"梅州","city":"meizhou"
	 * }],"浙江":[{"id":6575,"name":"嘉兴","city"
	 * :"jiaxing"},{"id":6573,"name":"杭州","isHot"
	 * :true,"city":"hangzhou"},{"id":6579
	 * ,"name":"绍兴","city":"shaoxing"},{"id":6582
	 * ,"name":"舟山","city":"zhoushan"},
	 * {"id":6576,"name":"金华","city":"jinhua"},{"id"
	 * :6580,"name":"台州","city":"taizhou"
	 * },{"id":6577,"name":"丽水","city":"lishui"
	 * },{"id":6574,"name":"湖州","city":"huzhou"
	 * },{"id":6583,"name":"衢州","city":"quzhou"
	 * },{"id":6581,"name":"温州","city":"wenzhou"
	 * },{"id":6578,"name":"宁波","city":"ningbo"
	 * }],"天津":[{"id":6533,"name":"天津","city"
	 * :"tianjin"}],"江苏":[{"id":6416,"name"
	 * :"苏州","city":"suzhou"},{"id":6419,"name"
	 * :"无锡","city":"wuxi"},{"id":6414,"name"
	 * :"南京","isHot":true,"city":"nanjing"}
	 * ,{"id":6415,"name":"南通","city":"nantong"
	 * },{"id":6422,"name":"扬州","city":"yangzhou"
	 * },{"id":6411,"name":"常州","city":
	 * "changzhou"},{"id":6420,"name":"徐州","city"
	 * :"xuzhou"},{"id":6418,"name":"泰州"
	 * ,"city":"taizhoushi"},{"id":6413,"name":"连云港"
	 * ,"city":"lianyungang"},{"id":
	 * 6421,"name":"盐城","city":"yancheng"},{"id":6417
	 * ,"name":"宿迁","city":"suqian"
	 * }],"河北":[{"id":6337,"name":"唐山","city":"tangshan"
	 * },{"id":6335,"name":"秦皇岛"
	 * ,"city":"qinhuangdao"},{"id":6331,"name":"承德","city"
	 * :"chengde"},{"id":6339
	 * ,"name":"张家口","city":"zhangjiakou"},{"id":6334,"name"
	 * :"廊坊","city":"langfang"
	 * },{"id":6329,"name":"保定","city":"baoding"},{"id":6336
	 * ,"name":"石家庄","city":
	 * "shijiazhuang"}],"广西":[{"id":6298,"name":"南宁","city":
	 * "nanning"}],"福建":[{"id"
	 * :6244,"name":"福州","city":"fuzhou"},{"id":6251,"name"
	 * :"厦门","city":"xiamen"}
	 * ,{"id":6249,"name":"泉州","city":"quanzhou"}],"吉林":[{"id"
	 * :6404,"name":"长春","city"
	 * :"changchun"},{"id":6405,"name":"吉林","city":"jilin"
	 * }],"海南":[{"id":6317,"name"
	 * :"海口","city":"haikou"}],"云南":[{"id":6563,"name":
	 * "昆明","city":"kunming"}],"上海"
	 * :[{"id":6511,"name":"上海","isHot":true,"city":"shanghai"
	 * }],"湖北":[{"id":6382
	 * ,"name":"武汉","city":"wuhan"},{"id":6387,"name":"宜昌","city"
	 * :"yichang"}],"江西"
	 * :[{"id":6429,"name":"南昌","city":"nanchang"}],"湖南":[{"id":
	 * 6389,"name":"长沙",
	 * "city":"changsha"}],"河南":[{"id":6353,"name":"郑州","city":"zhengzhou"
	 * },{"id"
	 * :6345,"name":"洛阳","city":"luoyang"}],"山东":[{"id":6482,"name":"青岛","city"
	 * :"qingdao"
	 * },{"id":6487,"name":"烟台","city":"yantai"},{"id":6484,"name":"泰安"
	 * ,"city":"taian"
	 * },{"id":6477,"name":"济南","city":"jinan"},{"id":6486,"name":
	 * "潍坊","city":"weifang"
	 * },{"id":6481,"name":"临沂","city":"linyi"},{"id":6485,"name"
	 * :"威海","city":"weihai"
	 * }],"贵州":[{"id":6304,"name":"贵阳","city":"guiyang"}],"安徽"
	 * :[{"id":6232,"name"
	 * :"合肥","city":"hefei"},{"id":6240,"name":"芜湖","city":"wuhu"
	 * }],"陕西":[{"id":6507
	 * ,"name":"西安","city":"xian"}],"辽宁":[{"id":6438,"name":"大连"
	 * ,"city":"dalian"}
	 * ,{"id":6446,"name":"沈阳","city":"shenyang"},{"id":6442,"name"
	 * :"葫芦岛","city":
	 * "huludao"},{"id":6443,"name":"锦州","city":"jinzhou"},{"id":6439
	 * ,"name":"丹东"
	 * ,"city":"dandong"},{"id":6445,"name":"盘锦","city":"panjin"},{"id"
	 * :6448,"name"
	 * :"营口","city":"yingkou"}],"山西":[{"id":6497,"name":"太原","city":"taiyuan"
	 * },{"id"
	 * :6493,"name":"晋中","city":"jinzhong"},{"id":6499,"name":"阳泉","city":
	 * "yangquan"}],"黑龙江":[{"id":6360,"name":"哈尔滨","city":"harbin"}]} indexWhat
	 * : [{"name":"爬山","url":"/beijing/dest/scenery_0-2","id":2},{"name":"赏花",
	 * "url":"/beijing/dest/scenery_0-6","id":6},{"name":"踏青","url":
	 * "/beijing/dest/scenery_0-7"
	 * ,"id":7},{"name":"古镇","url":"/beijing/dest/scenery_0-29"
	 * ,"id":29},{"name":
	 * "人文","url":"/beijing/dest/scenery_0-23","id":23},{"name"
	 * :"公园","url":"/beijing/dest/scenery_0-25","id":25}] cityName : 北京
	 * indexBanner :
	 * [{"name":"","img":"9527a533c8139fd1345df4b77f0a8237.jpg","eventName"
	 * :"hongye"
	 * ,"modified":1446518366238,"id":"56337adf0cf2248d18bc2afc","type":
	 * "recommend","to":"56381e4d0cf2248d18bc2b1d"},{"name":"","img":
	 * "d21858828ef7b7b757e1cfab4aee9774.jpg"
	 * ,"eventName":"book","modified":1441973113460
	 * ,"id":"55f2c37f0cf2b777cb4ecd7a"
	 * ,"type":"recommend","to":"556427de0cf222259208bc6b"}]
	 */

	private DataEntity data;
	private String msg;

	public void setStatus(int status) {
		this.status = status;
	}

	public void setData(DataEntity data) {
		this.data = data;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public int getStatus() {
		return status;
	}

	public DataEntity getData() {
		return data;
	}

	public String getMsg() {
		return msg;
	}

	public static class DataEntity {
		private int cityId;
		private OpenCityEntity openCity;
		private String cityName;
		/**
		 * _id : 5636ebd20cf2248d18bc2b18 cityId : 1 endTime : 1448294400000 img
		 * : fe509d4f81f34e15ee624bf14532fa56.jpg modified : 1446439890399 name
		 * : 青春专场 startTime : 1446393600000 subtitle : 摇滚不死 梦想依旧 to :
		 * 5636ebc90cf2248d18bc2b17 type : theme
		 */

		private List<AdletEntity> adlet;
		/**
		 * name : 爬山 url : /beijing/dest/scenery_0-2 id : 2
		 */

		private List<IndexWhatEntity> indexWhat;
		/**
		 * name : img : 9527a533c8139fd1345df4b77f0a8237.jpg eventName : hongye
		 * modified : 1446518366238 id : 56337adf0cf2248d18bc2afc type :
		 * recommend to : 56381e4d0cf2248d18bc2b1d
		 */

		private List<IndexBannerEntity> indexBanner;

		public void setCityId(int cityId) {
			this.cityId = cityId;
		}

		public void setOpenCity(OpenCityEntity openCity) {
			this.openCity = openCity;
		}

		public void setCityName(String cityName) {
			this.cityName = cityName;
		}

		public void setAdlet(List<AdletEntity> adlet) {
			this.adlet = adlet;
		}

		public void setIndexWhat(List<IndexWhatEntity> indexWhat) {
			this.indexWhat = indexWhat;
		}

		public void setIndexBanner(List<IndexBannerEntity> indexBanner) {
			this.indexBanner = indexBanner;
		}

		public int getCityId() {
			return cityId;
		}

		public OpenCityEntity getOpenCity() {
			return openCity;
		}

		public String getCityName() {
			return cityName;
		}

		public List<AdletEntity> getAdlet() {
			return adlet;
		}

		public List<IndexWhatEntity> getIndexWhat() {
			return indexWhat;
		}

		public List<IndexBannerEntity> getIndexBanner() {
			return indexBanner;
		}

		public static class OpenCityEntity {
			/**
			 * id : 1 name : 北京 isHot : true city : beijing
			 */

			private List<北京Entity> 北京;
			/**
			 * id : 6584 name : 重庆 city : chongqing
			 */

			private List<重庆Entity> 重庆;
			/**
			 * id : 6514 name : 成都 city : chengdu
			 */

			private List<四川Entity> 四川;
			/**
			 * id : 6281 name : 深圳 city : shenzhen
			 */

			private List<广东Entity> 广东;
			/**
			 * id : 6575 name : 嘉兴 city : jiaxing
			 */

			private List<浙江Entity> 浙江;
			/**
			 * id : 6533 name : 天津 city : tianjin
			 */

			private List<天津Entity> 天津;
			/**
			 * id : 6416 name : 苏州 city : suzhou
			 */

			private List<江苏Entity> 江苏;
			/**
			 * id : 6337 name : 唐山 city : tangshan
			 */

			private List<河北Entity> 河北;
			/**
			 * id : 6298 name : 南宁 city : nanning
			 */

			private List<广西Entity> 广西;
			/**
			 * id : 6244 name : 福州 city : fuzhou
			 */

			private List<福建Entity> 福建;
			/**
			 * id : 6404 name : 长春 city : changchun
			 */

			private List<吉林Entity> 吉林;
			/**
			 * id : 6317 name : 海口 city : haikou
			 */

			private List<海南Entity> 海南;
			/**
			 * id : 6563 name : 昆明 city : kunming
			 */

			private List<云南Entity> 云南;
			/**
			 * id : 6511 name : 上海 isHot : true city : shanghai
			 */

			private List<上海Entity> 上海;
			/**
			 * id : 6382 name : 武汉 city : wuhan
			 */

			private List<湖北Entity> 湖北;
			/**
			 * id : 6429 name : 南昌 city : nanchang
			 */

			private List<江西Entity> 江西;
			/**
			 * id : 6389 name : 长沙 city : changsha
			 */

			private List<湖南Entity> 湖南;
			/**
			 * id : 6353 name : 郑州 city : zhengzhou
			 */

			private List<河南Entity> 河南;
			/**
			 * id : 6482 name : 青岛 city : qingdao
			 */

			private List<山东Entity> 山东;
			/**
			 * id : 6304 name : 贵阳 city : guiyang
			 */

			private List<贵州Entity> 贵州;
			/**
			 * id : 6232 name : 合肥 city : hefei
			 */

			private List<安徽Entity> 安徽;
			/**
			 * id : 6507 name : 西安 city : xian
			 */

			private List<陕西Entity> 陕西;
			/**
			 * id : 6438 name : 大连 city : dalian
			 */

			private List<辽宁Entity> 辽宁;
			/**
			 * id : 6497 name : 太原 city : taiyuan
			 */

			private List<山西Entity> 山西;
			/**
			 * id : 6360 name : 哈尔滨 city : harbin
			 */

			private List<黑龙江Entity> 黑龙江;

			public void set北京(List<北京Entity> 北京) {
				this.北京 = 北京;
			}

			public void set重庆(List<重庆Entity> 重庆) {
				this.重庆 = 重庆;
			}

			public void set四川(List<四川Entity> 四川) {
				this.四川 = 四川;
			}

			public void set广东(List<广东Entity> 广东) {
				this.广东 = 广东;
			}

			public void set浙江(List<浙江Entity> 浙江) {
				this.浙江 = 浙江;
			}

			public void set天津(List<天津Entity> 天津) {
				this.天津 = 天津;
			}

			public void set江苏(List<江苏Entity> 江苏) {
				this.江苏 = 江苏;
			}

			public void set河北(List<河北Entity> 河北) {
				this.河北 = 河北;
			}

			public void set广西(List<广西Entity> 广西) {
				this.广西 = 广西;
			}

			public void set福建(List<福建Entity> 福建) {
				this.福建 = 福建;
			}

			public void set吉林(List<吉林Entity> 吉林) {
				this.吉林 = 吉林;
			}

			public void set海南(List<海南Entity> 海南) {
				this.海南 = 海南;
			}

			public void set云南(List<云南Entity> 云南) {
				this.云南 = 云南;
			}

			public void set上海(List<上海Entity> 上海) {
				this.上海 = 上海;
			}

			public void set湖北(List<湖北Entity> 湖北) {
				this.湖北 = 湖北;
			}

			public void set江西(List<江西Entity> 江西) {
				this.江西 = 江西;
			}

			public void set湖南(List<湖南Entity> 湖南) {
				this.湖南 = 湖南;
			}

			public void set河南(List<河南Entity> 河南) {
				this.河南 = 河南;
			}

			public void set山东(List<山东Entity> 山东) {
				this.山东 = 山东;
			}

			public void set贵州(List<贵州Entity> 贵州) {
				this.贵州 = 贵州;
			}

			public void set安徽(List<安徽Entity> 安徽) {
				this.安徽 = 安徽;
			}

			public void set陕西(List<陕西Entity> 陕西) {
				this.陕西 = 陕西;
			}

			public void set辽宁(List<辽宁Entity> 辽宁) {
				this.辽宁 = 辽宁;
			}

			public void set山西(List<山西Entity> 山西) {
				this.山西 = 山西;
			}

			public void set黑龙江(List<黑龙江Entity> 黑龙江) {
				this.黑龙江 = 黑龙江;
			}

			public List<北京Entity> get北京() {
				return 北京;
			}

			public List<重庆Entity> get重庆() {
				return 重庆;
			}

			public List<四川Entity> get四川() {
				return 四川;
			}

			public List<广东Entity> get广东() {
				return 广东;
			}

			public List<浙江Entity> get浙江() {
				return 浙江;
			}

			public List<天津Entity> get天津() {
				return 天津;
			}

			public List<江苏Entity> get江苏() {
				return 江苏;
			}

			public List<河北Entity> get河北() {
				return 河北;
			}

			public List<广西Entity> get广西() {
				return 广西;
			}

			public List<福建Entity> get福建() {
				return 福建;
			}

			public List<吉林Entity> get吉林() {
				return 吉林;
			}

			public List<海南Entity> get海南() {
				return 海南;
			}

			public List<云南Entity> get云南() {
				return 云南;
			}

			public List<上海Entity> get上海() {
				return 上海;
			}

			public List<湖北Entity> get湖北() {
				return 湖北;
			}

			public List<江西Entity> get江西() {
				return 江西;
			}

			public List<湖南Entity> get湖南() {
				return 湖南;
			}

			public List<河南Entity> get河南() {
				return 河南;
			}

			public List<山东Entity> get山东() {
				return 山东;
			}

			public List<贵州Entity> get贵州() {
				return 贵州;
			}

			public List<安徽Entity> get安徽() {
				return 安徽;
			}

			public List<陕西Entity> get陕西() {
				return 陕西;
			}

			public List<辽宁Entity> get辽宁() {
				return 辽宁;
			}

			public List<山西Entity> get山西() {
				return 山西;
			}

			public List<黑龙江Entity> get黑龙江() {
				return 黑龙江;
			}

			public static class 北京Entity {
				private int id;
				private String name;
				private boolean isHot;
				private String city;

				public void setId(int id) {
					this.id = id;
				}

				public void setName(String name) {
					this.name = name;
				}

				public void setIsHot(boolean isHot) {
					this.isHot = isHot;
				}

				public void setCity(String city) {
					this.city = city;
				}

				public int getId() {
					return id;
				}

				public String getName() {
					return name;
				}

				public boolean isIsHot() {
					return isHot;
				}

				public String getCity() {
					return city;
				}
			}

			public static class 重庆Entity {
				private int id;
				private String name;
				private String city;

				public void setId(int id) {
					this.id = id;
				}

				public void setName(String name) {
					this.name = name;
				}

				public void setCity(String city) {
					this.city = city;
				}

				public int getId() {
					return id;
				}

				public String getName() {
					return name;
				}

				public String getCity() {
					return city;
				}
			}

			public static class 四川Entity {
				private int id;
				private String name;
				private String city;

				public void setId(int id) {
					this.id = id;
				}

				public void setName(String name) {
					this.name = name;
				}

				public void setCity(String city) {
					this.city = city;
				}

				public int getId() {
					return id;
				}

				public String getName() {
					return name;
				}

				public String getCity() {
					return city;
				}
			}

			public static class 广东Entity {
				private int id;
				private String name;
				private String city;

				public void setId(int id) {
					this.id = id;
				}

				public void setName(String name) {
					this.name = name;
				}

				public void setCity(String city) {
					this.city = city;
				}

				public int getId() {
					return id;
				}

				public String getName() {
					return name;
				}

				public String getCity() {
					return city;
				}
			}

			public static class 浙江Entity {
				private int id;
				private String name;
				private String city;

				public void setId(int id) {
					this.id = id;
				}

				public void setName(String name) {
					this.name = name;
				}

				public void setCity(String city) {
					this.city = city;
				}

				public int getId() {
					return id;
				}

				public String getName() {
					return name;
				}

				public String getCity() {
					return city;
				}
			}

			public static class 天津Entity {
				private int id;
				private String name;
				private String city;

				public void setId(int id) {
					this.id = id;
				}

				public void setName(String name) {
					this.name = name;
				}

				public void setCity(String city) {
					this.city = city;
				}

				public int getId() {
					return id;
				}

				public String getName() {
					return name;
				}

				public String getCity() {
					return city;
				}
			}

			public static class 江苏Entity {
				private int id;
				private String name;
				private String city;

				public void setId(int id) {
					this.id = id;
				}

				public void setName(String name) {
					this.name = name;
				}

				public void setCity(String city) {
					this.city = city;
				}

				public int getId() {
					return id;
				}

				public String getName() {
					return name;
				}

				public String getCity() {
					return city;
				}
			}

			public static class 河北Entity {
				private int id;
				private String name;
				private String city;

				public void setId(int id) {
					this.id = id;
				}

				public void setName(String name) {
					this.name = name;
				}

				public void setCity(String city) {
					this.city = city;
				}

				public int getId() {
					return id;
				}

				public String getName() {
					return name;
				}

				public String getCity() {
					return city;
				}
			}

			public static class 广西Entity {
				private int id;
				private String name;
				private String city;

				public void setId(int id) {
					this.id = id;
				}

				public void setName(String name) {
					this.name = name;
				}

				public void setCity(String city) {
					this.city = city;
				}

				public int getId() {
					return id;
				}

				public String getName() {
					return name;
				}

				public String getCity() {
					return city;
				}
			}

			public static class 福建Entity {
				private int id;
				private String name;
				private String city;

				public void setId(int id) {
					this.id = id;
				}

				public void setName(String name) {
					this.name = name;
				}

				public void setCity(String city) {
					this.city = city;
				}

				public int getId() {
					return id;
				}

				public String getName() {
					return name;
				}

				public String getCity() {
					return city;
				}
			}

			public static class 吉林Entity {
				private int id;
				private String name;
				private String city;

				public void setId(int id) {
					this.id = id;
				}

				public void setName(String name) {
					this.name = name;
				}

				public void setCity(String city) {
					this.city = city;
				}

				public int getId() {
					return id;
				}

				public String getName() {
					return name;
				}

				public String getCity() {
					return city;
				}
			}

			public static class 海南Entity {
				private int id;
				private String name;
				private String city;

				public void setId(int id) {
					this.id = id;
				}

				public void setName(String name) {
					this.name = name;
				}

				public void setCity(String city) {
					this.city = city;
				}

				public int getId() {
					return id;
				}

				public String getName() {
					return name;
				}

				public String getCity() {
					return city;
				}
			}

			public static class 云南Entity {
				private int id;
				private String name;
				private String city;

				public void setId(int id) {
					this.id = id;
				}

				public void setName(String name) {
					this.name = name;
				}

				public void setCity(String city) {
					this.city = city;
				}

				public int getId() {
					return id;
				}

				public String getName() {
					return name;
				}

				public String getCity() {
					return city;
				}
			}

			public static class 上海Entity {
				private int id;
				private String name;
				private boolean isHot;
				private String city;

				public void setId(int id) {
					this.id = id;
				}

				public void setName(String name) {
					this.name = name;
				}

				public void setIsHot(boolean isHot) {
					this.isHot = isHot;
				}

				public void setCity(String city) {
					this.city = city;
				}

				public int getId() {
					return id;
				}

				public String getName() {
					return name;
				}

				public boolean isIsHot() {
					return isHot;
				}

				public String getCity() {
					return city;
				}
			}

			public static class 湖北Entity {
				private int id;
				private String name;
				private String city;

				public void setId(int id) {
					this.id = id;
				}

				public void setName(String name) {
					this.name = name;
				}

				public void setCity(String city) {
					this.city = city;
				}

				public int getId() {
					return id;
				}

				public String getName() {
					return name;
				}

				public String getCity() {
					return city;
				}
			}

			public static class 江西Entity {
				private int id;
				private String name;
				private String city;

				public void setId(int id) {
					this.id = id;
				}

				public void setName(String name) {
					this.name = name;
				}

				public void setCity(String city) {
					this.city = city;
				}

				public int getId() {
					return id;
				}

				public String getName() {
					return name;
				}

				public String getCity() {
					return city;
				}
			}

			public static class 湖南Entity {
				private int id;
				private String name;
				private String city;

				public void setId(int id) {
					this.id = id;
				}

				public void setName(String name) {
					this.name = name;
				}

				public void setCity(String city) {
					this.city = city;
				}

				public int getId() {
					return id;
				}

				public String getName() {
					return name;
				}

				public String getCity() {
					return city;
				}
			}

			public static class 河南Entity {
				private int id;
				private String name;
				private String city;

				public void setId(int id) {
					this.id = id;
				}

				public void setName(String name) {
					this.name = name;
				}

				public void setCity(String city) {
					this.city = city;
				}

				public int getId() {
					return id;
				}

				public String getName() {
					return name;
				}

				public String getCity() {
					return city;
				}
			}

			public static class 山东Entity {
				private int id;
				private String name;
				private String city;

				public void setId(int id) {
					this.id = id;
				}

				public void setName(String name) {
					this.name = name;
				}

				public void setCity(String city) {
					this.city = city;
				}

				public int getId() {
					return id;
				}

				public String getName() {
					return name;
				}

				public String getCity() {
					return city;
				}
			}

			public static class 贵州Entity {
				private int id;
				private String name;
				private String city;

				public void setId(int id) {
					this.id = id;
				}

				public void setName(String name) {
					this.name = name;
				}

				public void setCity(String city) {
					this.city = city;
				}

				public int getId() {
					return id;
				}

				public String getName() {
					return name;
				}

				public String getCity() {
					return city;
				}
			}

			public static class 安徽Entity {
				private int id;
				private String name;
				private String city;

				public void setId(int id) {
					this.id = id;
				}

				public void setName(String name) {
					this.name = name;
				}

				public void setCity(String city) {
					this.city = city;
				}

				public int getId() {
					return id;
				}

				public String getName() {
					return name;
				}

				public String getCity() {
					return city;
				}
			}

			public static class 陕西Entity {
				private int id;
				private String name;
				private String city;

				public void setId(int id) {
					this.id = id;
				}

				public void setName(String name) {
					this.name = name;
				}

				public void setCity(String city) {
					this.city = city;
				}

				public int getId() {
					return id;
				}

				public String getName() {
					return name;
				}

				public String getCity() {
					return city;
				}
			}

			public static class 辽宁Entity {
				private int id;
				private String name;
				private String city;

				public void setId(int id) {
					this.id = id;
				}

				public void setName(String name) {
					this.name = name;
				}

				public void setCity(String city) {
					this.city = city;
				}

				public int getId() {
					return id;
				}

				public String getName() {
					return name;
				}

				public String getCity() {
					return city;
				}
			}

			public static class 山西Entity {
				private int id;
				private String name;
				private String city;

				public void setId(int id) {
					this.id = id;
				}

				public void setName(String name) {
					this.name = name;
				}

				public void setCity(String city) {
					this.city = city;
				}

				public int getId() {
					return id;
				}

				public String getName() {
					return name;
				}

				public String getCity() {
					return city;
				}
			}

			public static class 黑龙江Entity {
				private int id;
				private String name;
				private String city;

				public void setId(int id) {
					this.id = id;
				}

				public void setName(String name) {
					this.name = name;
				}

				public void setCity(String city) {
					this.city = city;
				}

				public int getId() {
					return id;
				}

				public String getName() {
					return name;
				}

				public String getCity() {
					return city;
				}
			}
		}

		public static class AdletEntity {
			private String _id;
			private int cityId;
			private long endTime;
			private String img;
			private long modified;
			private String name;
			private long startTime;
			private String subtitle;
			private String to;
			private String type;

			public void set_id(String _id) {
				this._id = _id;
			}

			public void setCityId(int cityId) {
				this.cityId = cityId;
			}

			public void setEndTime(long endTime) {
				this.endTime = endTime;
			}

			public void setImg(String img) {
				this.img = img;
			}

			public void setModified(long modified) {
				this.modified = modified;
			}

			public void setName(String name) {
				this.name = name;
			}

			public void setStartTime(long startTime) {
				this.startTime = startTime;
			}

			public void setSubtitle(String subtitle) {
				this.subtitle = subtitle;
			}

			public void setTo(String to) {
				this.to = to;
			}

			public void setType(String type) {
				this.type = type;
			}

			public String get_id() {
				return _id;
			}

			public int getCityId() {
				return cityId;
			}

			public long getEndTime() {
				return endTime;
			}

			public String getImg() {
				return img;
			}

			public long getModified() {
				return modified;
			}

			public String getName() {
				return name;
			}

			public long getStartTime() {
				return startTime;
			}

			public String getSubtitle() {
				return subtitle;
			}

			public String getTo() {
				return to;
			}

			public String getType() {
				return type;
			}
		}

		public static class IndexWhatEntity {
			private String name;
			private String url;
			private int id;

			public void setName(String name) {
				this.name = name;
			}

			public void setUrl(String url) {
				this.url = url;
			}

			public void setId(int id) {
				this.id = id;
			}

			public String getName() {
				return name;
			}

			public String getUrl() {
				return url;
			}

			public int getId() {
				return id;
			}
		}

		public static class IndexBannerEntity {
			private String name;
			private String img;
			private String eventName;
			private long modified;
			private String id;
			private String type;
			private String to;

			public void setName(String name) {
				this.name = name;
			}

			public void setImg(String img) {
				this.img = img;
			}

			public void setEventName(String eventName) {
				this.eventName = eventName;
			}

			public void setModified(long modified) {
				this.modified = modified;
			}

			public void setId(String id) {
				this.id = id;
			}

			public void setType(String type) {
				this.type = type;
			}

			public void setTo(String to) {
				this.to = to;
			}

			public String getName() {
				return name;
			}

			public String getImg() {
				return img;
			}

			public String getEventName() {
				return eventName;
			}

			public long getModified() {
				return modified;
			}

			public String getId() {
				return id;
			}

			public String getType() {
				return type;
			}

			public String getTo() {
				return to;
			}
		}
	}
}
