package com.seventeen.plus.bean;

import java.util.List;

/**
 * Created by Administrator on 2015/11/6.
 */
public class IndexListViewBean {

	/**
	 * status : 0 data :
	 * {"list":[{"headImg":"u_9a49d6b360dd391a2db4a4992881095b.jpg"
	 * ,"items":[{"desc"
	 * :"置身这四季如画的青山绿水之间，暖汤私密时光，使这里成为一个远离喧嚣的世外桃源。","name":"金隅凤山温泉，温泉湖光山色"
	 * ,"img":"u_fd4725f674d9b6e3198b65fed3c09e57.jpg"
	 * ,"label":"昌平区，景点","recommend"
	 * :{"id":"5603ef560cf255e649651834","priceRange"
	 * :[238,238],"expired":false,"price"
	 * :238,"fav":64,"lnglat":[116.283937,40.241448
	 * ],"label":"昌平区，景点","type":"scene","district":"昌平区"}},{"desc":
	 * "美人鱼温泉宫位于九华国际会展中心大酒店地下一层，拥有中式浴、藏式浴、人参浴、牛奶浴等十种特色温泉浴和水晶浴、木炭浴、玉石浴、玛瑙浴、光波浴等九种保健桑拿浴"
	 * ,"name":"来九华山美人宫泡温泉可好","img":"u_62536416282060941598b9d89cdfcc37.jpg",
	 * "label"
	 * :"昌平区，景点","recommend":{"id":"5606234c0cf236e92fd54e81","priceRange"
	 * :[85,85
	 * ],"expired":false,"price":85,"fav":48,"lnglat":[116.417656,40.179866
	 * ],"label":"昌平区，景点","type":"scene","district":"昌平区"}},{"desc":
	 * "度假村设计美轮美奂，达到四星标准，处处散发着恬静优雅的禅意。丰富多彩的温泉浴，温馨舒适的客房，设施齐备的会议室，精心烹制的各种美味佳肴."
	 * ,"name":"春晖园情侣套餐，过周末暖汤时光","img":"u_f0a1f29da7b144b1c9b27e9700eb3450.jpg",
	 * "label"
	 * :"顺义区，景点","recommend":{"id":"560626f90cf236e92fd54e8d","priceRange"
	 * :[518,518
	 * ],"expired":false,"price":518,"fav":75,"lnglat":[116.4923,40.127793
	 * ],"label":"顺义区，景点","type":"scene","district":"顺义区"}},{"desc":
	 * "温泉水源自地下2000米深处，出水温度54摄氏度，水质优良，富含人体所需的氟、硫、铁、硅等多种矿物质及微量元素，具有特殊的保健和美肤功效。"
	 * ,"name"
	 * :"北京金隅八达岭温泉度假村","img":"u_90a22178c122a4488204bba424acfedd.jpg","label"
	 * :"延庆县，景点"
	 * ,"recommend":{"id":"561d146b0cf2e1c1ad6fc098","priceRange":[168,168
	 * ],"expired"
	 * :false,"price":168,"fav":59,"lnglat":[115.973028,40.476028],"label"
	 * :"延庆县，景点","type":"scene","district":"延庆县"}},{"desc":
	 * "50多个温泉泡池高低错落，向人叙说着温泉文化的底蕴;室外温泉区的露天温泉泡池，让人与大自然亲密接触"
	 * ,"name":"温都水城的暖泉时光","img"
	 * :"u_565fe5fc8d45000960c59e44115b6ccc.jpg","label"
	 * :"昌平区，景点","recommend":{"id"
	 * :"561e40600cf2b5a271d27904","priceRange":[128,178
	 * ],"expired":false,"price"
	 * :178,"fav":63,"lnglat":[116.371063,40.104018],"label"
	 * :"昌平区，景点","type":"scene"
	 * ,"district":"昌平区"}},{"desc":"温泉水滑洗凝脂，龙脉的暖汤时光，美好的你想不到"
	 * ,"name":"龙脉温泉一日套餐，你准备好了么"
	 * ,"img":"u_ad982beaac7c47a4002419a0ee45cf7b.jpg","label"
	 * :"昌平区，景点","recommend"
	 * :{"id":"561e4c410cf2b5a271d27927","priceRange":[160,660
	 * ],"expired":true,"price"
	 * :340,"fav":34,"lnglat":[116.399723,40.180738],"label"
	 * :"昌平区，景点","type":"scene"
	 * ,"district":"昌平区"}},{"desc":"北京运河源温泉温泉井深达近3000米，水温较高。绝对适合周末一家人温馨泡汤"
	 * ,"name"
	 * :"北京运河源温泉，通州的温泉汤生活","img":"u_12798ed36943e845b7d3b99db883bb30.jpg",
	 * "label"
	 * :"通州区，景点","recommend":{"id":"561e51da0cf2b5a271d27987","priceRange"
	 * :[59,119
	 * ],"expired":true,"price":119,"fav":58,"lnglat":[116.683408,39.891362
	 * ],"label":"通州区，景点","type":"scene","district":"通州区"}},{"desc":
	 * "南宫温泉水世界近邻南宫世界地热博览园、温室公园、鹦鹉园、青龙湖、千灵山、泉怡园生态餐厅、南宫恒源商厦、超市、南宫天空城堡儿童乐园、南宫冰雪嘉年华。"
	 * ,"name":"南宫温泉水世界的冬汤生活","img":"u_9a49d6b360dd391a2db4a4992881095b.jpg",
	 * "label"
	 * :"丰台区，景点","recommend":{"id":"561e58720cf2b5a271d279eb","priceRange"
	 * :[130,145
	 * ],"expired":false,"price":145,"fav":49,"lnglat":[116.15406,39.80514
	 * ],"label"
	 * :"丰台区，景点","type":"scene","district":"丰台区"}}],"cityId":1,"cityName"
	 * :"北京","name"
	 * :"下雪了，泡个暖汤可好","month":[1,2,11,12],"subtitle":"温汤暖泉，好周末都在这里","isTop"
	 * :0,"cityEnName"
	 * :"beijing","type":0,"sname":"北京泡温泉","modified":1446776517753
	 * ,"id":"563c0ec70cf2a12275e05200"
	 * ,"fav":43,"imgs":["u_12798ed36943e845b7d3b99db883bb30.jpg"
	 * ,"u_9a49d6b360dd391a2db4a4992881095b.jpg"
	 * ,"u_ad982beaac7c47a4002419a0ee45cf7b.jpg"
	 * ,"u_565fe5fc8d45000960c59e44115b6ccc.jpg"
	 * ]},{"headImg":"u_97f875fe9c9eb6b1252bd45af568a46d.jpg"
	 * ,"items":[{"desc":"隨著創作主導主唱小姐Fran性格中的詭魅，將法蘭黛的音樂領向一處看霧非霧、幽明不定的世界。"
	 * ,"name":"Frandé 法兰黛乐团 2015 首度巡演 北京愚公移山"
	 * ,"img":"u_066a7721b79912fa424d8d79935c27c5.jpg"
	 * ,"label":"，活动","recommend":
	 * {"id":"5639afff0cf2e66b4184af5c","startTime":1446987600000
	 * ,"priceRange":[85
	 * ,85],"expired":false,"price":85,"fav":55,"lnglat":[116.415092
	 * ,39.934142],"label":"，活动","type":"event","district":"东城区"}},{"desc":
	 * "加拿大摇滚/爵士乐队Jessica Stuart Few中国巡演北京站(大师班+演出)"
	 * ,"name":"加拿大爵士乐队 Jessica Stuart Few 中国巡演 北京DDC"
	 * ,"img":"u_417abf3a59ba79adac36fabd782d05fc.jpg"
	 * ,"label":"，活动","recommend":
	 * {"id":"5620ceb80cf2e906527436a4","startTime":1446966000000
	 * ,"priceRange":[50
	 * ,100],"expired":false,"price":50,"fav":39,"lnglat":[116.4104309082031
	 * ,39.93211364746094
	 * ],"label":"，活动","type":"event","district":"东城区"}},{"desc"
	 * :"我们没有长长的跑道，我们不需要绘画技巧，一件白色T恤，一支笔，进入新声浪的彩虹工厂，绝对让你一次色个够！"
	 * ,"name":"音乐彩绘谜样的周末午后"
	 * ,"img":"u_b632f001654c627aa9fbba1c0897f429.jpg","label"
	 * :"，活动","recommend":
	 * {"id":"5639b0050cf2e66b4184af61","startTime":1446962400000
	 * ,"priceRange":[35
	 * ,45],"expired":false,"price":45,"fav":36,"lnglat":[116.4131927490234
	 * ,39.9484977722168
	 * ],"label":"，活动","type":"event","district":"东城区"}},{"desc"
	 * :"沉寂两年，李夏带着立東乐队回来了，给你一个国内首场民谣摇滚专场演出。"
	 * ,"name":"李夏与立東乐队民谣/摇滚","img":"u_1a674b6095739c30d6f13a0651c052df.jpg"
	 * ,"label":"，活动","recommend":{"id":"5621d80e0cf2e90652743756","startTime":
	 * 1446904800000
	 * ,"priceRange":[55,55],"expired":false,"price":55,"fav":34,"lnglat"
	 * :[116.4104309082031
	 * ,39.93211364746094],"label":"，活动","type":"event","district"
	 * :"东城区"}},{"desc":"黄绮珊\u201c只有你\u201d北京演唱会震撼启动 世界级音响品牌倾力助阵","name":
	 * "特价 \"只有你\"2015黄绮珊北京演唱会"
	 * ,"img":"u_97f875fe9c9eb6b1252bd45af568a46d.jpg","label"
	 * :"，活动","recommend":
	 * {"id":"5639a4d00cf2e66b4184af0b","startTime":1446895800000
	 * ,"priceRange":[373
	 * ,784],"expired":false,"price":373,"fav":46,"lnglat":[116.3902359008789
	 * ,39.99646759033203
	 * ],"label":"，活动","type":"event","district":"朝阳区"}}],"cityId"
	 * :1,"cityName":"北京"
	 * ,"name":"精彩音乐会一网打尽","month":[11],"subtitle":"与N种活动不期而遇",
	 * "isTop":0,"cityEnName"
	 * :"beijing","type":0,"sname":"精彩音乐会一网打","modified":1446696680989
	 * ,"id":"563ad6e80cf2a12275e051ec"
	 * ,"fav":39,"imgs":["u_97f875fe9c9eb6b1252bd45af568a46d.jpg"
	 * ,"u_1a674b6095739c30d6f13a0651c052df.jpg"
	 * ,"u_417abf3a59ba79adac36fabd782d05fc.jpg"
	 * ,"u_066a7721b79912fa424d8d79935c27c5.jpg"]}],"number":70} msg : OK
	 */

	private float status;
	/**
	 * list :
	 * [{"headImg":"u_9a49d6b360dd391a2db4a4992881095b.jpg","items":[{"desc"
	 * :"置身这四季如画的青山绿水之间，暖汤私密时光，使这里成为一个远离喧嚣的世外桃源。"
	 * ,"name":"金隅凤山温泉，温泉湖光山色","img":"u_fd4725f674d9b6e3198b65fed3c09e57.jpg"
	 * ,"label"
	 * :"昌平区，景点","recommend":{"id":"5603ef560cf255e649651834","priceRange"
	 * :[238,238
	 * ],"expired":false,"price":238,"fav":64,"lnglat":[116.283937,40.241448
	 * ],"label":"昌平区，景点","type":"scene","district":"昌平区"}},{"desc":
	 * "美人鱼温泉宫位于九华国际会展中心大酒店地下一层，拥有中式浴、藏式浴、人参浴、牛奶浴等十种特色温泉浴和水晶浴、木炭浴、玉石浴、玛瑙浴、光波浴等九种保健桑拿浴"
	 * ,"name":"来九华山美人宫泡温泉可好","img":"u_62536416282060941598b9d89cdfcc37.jpg",
	 * "label"
	 * :"昌平区，景点","recommend":{"id":"5606234c0cf236e92fd54e81","priceRange"
	 * :[85,85
	 * ],"expired":false,"price":85,"fav":48,"lnglat":[116.417656,40.179866
	 * ],"label":"昌平区，景点","type":"scene","district":"昌平区"}},{"desc":
	 * "度假村设计美轮美奂，达到四星标准，处处散发着恬静优雅的禅意。丰富多彩的温泉浴，温馨舒适的客房，设施齐备的会议室，精心烹制的各种美味佳肴."
	 * ,"name":"春晖园情侣套餐，过周末暖汤时光","img":"u_f0a1f29da7b144b1c9b27e9700eb3450.jpg",
	 * "label"
	 * :"顺义区，景点","recommend":{"id":"560626f90cf236e92fd54e8d","priceRange"
	 * :[518,518
	 * ],"expired":false,"price":518,"fav":75,"lnglat":[116.4923,40.127793
	 * ],"label":"顺义区，景点","type":"scene","district":"顺义区"}},{"desc":
	 * "温泉水源自地下2000米深处，出水温度54摄氏度，水质优良，富含人体所需的氟、硫、铁、硅等多种矿物质及微量元素，具有特殊的保健和美肤功效。"
	 * ,"name"
	 * :"北京金隅八达岭温泉度假村","img":"u_90a22178c122a4488204bba424acfedd.jpg","label"
	 * :"延庆县，景点"
	 * ,"recommend":{"id":"561d146b0cf2e1c1ad6fc098","priceRange":[168,168
	 * ],"expired"
	 * :false,"price":168,"fav":59,"lnglat":[115.973028,40.476028],"label"
	 * :"延庆县，景点","type":"scene","district":"延庆县"}},{"desc":
	 * "50多个温泉泡池高低错落，向人叙说着温泉文化的底蕴;室外温泉区的露天温泉泡池，让人与大自然亲密接触"
	 * ,"name":"温都水城的暖泉时光","img"
	 * :"u_565fe5fc8d45000960c59e44115b6ccc.jpg","label"
	 * :"昌平区，景点","recommend":{"id"
	 * :"561e40600cf2b5a271d27904","priceRange":[128,178
	 * ],"expired":false,"price"
	 * :178,"fav":63,"lnglat":[116.371063,40.104018],"label"
	 * :"昌平区，景点","type":"scene"
	 * ,"district":"昌平区"}},{"desc":"温泉水滑洗凝脂，龙脉的暖汤时光，美好的你想不到"
	 * ,"name":"龙脉温泉一日套餐，你准备好了么"
	 * ,"img":"u_ad982beaac7c47a4002419a0ee45cf7b.jpg","label"
	 * :"昌平区，景点","recommend"
	 * :{"id":"561e4c410cf2b5a271d27927","priceRange":[160,660
	 * ],"expired":true,"price"
	 * :340,"fav":34,"lnglat":[116.399723,40.180738],"label"
	 * :"昌平区，景点","type":"scene"
	 * ,"district":"昌平区"}},{"desc":"北京运河源温泉温泉井深达近3000米，水温较高。绝对适合周末一家人温馨泡汤"
	 * ,"name"
	 * :"北京运河源温泉，通州的温泉汤生活","img":"u_12798ed36943e845b7d3b99db883bb30.jpg",
	 * "label"
	 * :"通州区，景点","recommend":{"id":"561e51da0cf2b5a271d27987","priceRange"
	 * :[59,119
	 * ],"expired":true,"price":119,"fav":58,"lnglat":[116.683408,39.891362
	 * ],"label":"通州区，景点","type":"scene","district":"通州区"}},{"desc":
	 * "南宫温泉水世界近邻南宫世界地热博览园、温室公园、鹦鹉园、青龙湖、千灵山、泉怡园生态餐厅、南宫恒源商厦、超市、南宫天空城堡儿童乐园、南宫冰雪嘉年华。"
	 * ,"name":"南宫温泉水世界的冬汤生活","img":"u_9a49d6b360dd391a2db4a4992881095b.jpg",
	 * "label"
	 * :"丰台区，景点","recommend":{"id":"561e58720cf2b5a271d279eb","priceRange"
	 * :[130,145
	 * ],"expired":false,"price":145,"fav":49,"lnglat":[116.15406,39.80514
	 * ],"label"
	 * :"丰台区，景点","type":"scene","district":"丰台区"}}],"cityId":1,"cityName"
	 * :"北京","name"
	 * :"下雪了，泡个暖汤可好","month":[1,2,11,12],"subtitle":"温汤暖泉，好周末都在这里","isTop"
	 * :0,"cityEnName"
	 * :"beijing","type":0,"sname":"北京泡温泉","modified":1446776517753
	 * ,"id":"563c0ec70cf2a12275e05200"
	 * ,"fav":43,"imgs":["u_12798ed36943e845b7d3b99db883bb30.jpg"
	 * ,"u_9a49d6b360dd391a2db4a4992881095b.jpg"
	 * ,"u_ad982beaac7c47a4002419a0ee45cf7b.jpg"
	 * ,"u_565fe5fc8d45000960c59e44115b6ccc.jpg"
	 * ]},{"headImg":"u_97f875fe9c9eb6b1252bd45af568a46d.jpg"
	 * ,"items":[{"desc":"隨著創作主導主唱小姐Fran性格中的詭魅，將法蘭黛的音樂領向一處看霧非霧、幽明不定的世界。"
	 * ,"name":"Frandé 法兰黛乐团 2015 首度巡演 北京愚公移山"
	 * ,"img":"u_066a7721b79912fa424d8d79935c27c5.jpg"
	 * ,"label":"，活动","recommend":
	 * {"id":"5639afff0cf2e66b4184af5c","startTime":1446987600000
	 * ,"priceRange":[85
	 * ,85],"expired":false,"price":85,"fav":55,"lnglat":[116.415092
	 * ,39.934142],"label":"，活动","type":"event","district":"东城区"}},{"desc":
	 * "加拿大摇滚/爵士乐队Jessica Stuart Few中国巡演北京站(大师班+演出)"
	 * ,"name":"加拿大爵士乐队 Jessica Stuart Few 中国巡演 北京DDC"
	 * ,"img":"u_417abf3a59ba79adac36fabd782d05fc.jpg"
	 * ,"label":"，活动","recommend":
	 * {"id":"5620ceb80cf2e906527436a4","startTime":1446966000000
	 * ,"priceRange":[50
	 * ,100],"expired":false,"price":50,"fav":39,"lnglat":[116.4104309082031
	 * ,39.93211364746094
	 * ],"label":"，活动","type":"event","district":"东城区"}},{"desc"
	 * :"我们没有长长的跑道，我们不需要绘画技巧，一件白色T恤，一支笔，进入新声浪的彩虹工厂，绝对让你一次色个够！"
	 * ,"name":"音乐彩绘谜样的周末午后"
	 * ,"img":"u_b632f001654c627aa9fbba1c0897f429.jpg","label"
	 * :"，活动","recommend":
	 * {"id":"5639b0050cf2e66b4184af61","startTime":1446962400000
	 * ,"priceRange":[35
	 * ,45],"expired":false,"price":45,"fav":36,"lnglat":[116.4131927490234
	 * ,39.9484977722168
	 * ],"label":"，活动","type":"event","district":"东城区"}},{"desc"
	 * :"沉寂两年，李夏带着立東乐队回来了，给你一个国内首场民谣摇滚专场演出。"
	 * ,"name":"李夏与立東乐队民谣/摇滚","img":"u_1a674b6095739c30d6f13a0651c052df.jpg"
	 * ,"label":"，活动","recommend":{"id":"5621d80e0cf2e90652743756","startTime":
	 * 1446904800000
	 * ,"priceRange":[55,55],"expired":false,"price":55,"fav":34,"lnglat"
	 * :[116.4104309082031
	 * ,39.93211364746094],"label":"，活动","type":"event","district"
	 * :"东城区"}},{"desc":"黄绮珊\u201c只有你\u201d北京演唱会震撼启动 世界级音响品牌倾力助阵","name":
	 * "特价 \"只有你\"2015黄绮珊北京演唱会"
	 * ,"img":"u_97f875fe9c9eb6b1252bd45af568a46d.jpg","label"
	 * :"，活动","recommend":
	 * {"id":"5639a4d00cf2e66b4184af0b","startTime":1446895800000
	 * ,"priceRange":[373
	 * ,784],"expired":false,"price":373,"fav":46,"lnglat":[116.3902359008789
	 * ,39.99646759033203
	 * ],"label":"，活动","type":"event","district":"朝阳区"}}],"cityId"
	 * :1,"cityName":"北京"
	 * ,"name":"精彩音乐会一网打尽","month":[11],"subtitle":"与N种活动不期而遇",
	 * "isTop":0,"cityEnName"
	 * :"beijing","type":0,"sname":"精彩音乐会一网打","modified":1446696680989
	 * ,"id":"563ad6e80cf2a12275e051ec"
	 * ,"fav":39,"imgs":["u_97f875fe9c9eb6b1252bd45af568a46d.jpg"
	 * ,"u_1a674b6095739c30d6f13a0651c052df.jpg"
	 * ,"u_417abf3a59ba79adac36fabd782d05fc.jpg"
	 * ,"u_066a7721b79912fa424d8d79935c27c5.jpg"]}] number : 70
	 */

	private DataEntity data;
	private String msg;

	public void setStatus(float status) {
		this.status = status;
	}

	public void setData(DataEntity data) {
		this.data = data;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public float getStatus() {
		return status;
	}

	public DataEntity getData() {
		return data;
	}

	public String getMsg() {
		return msg;
	}

	public static class DataEntity {
		private float number;
		/**
		 * headImg : u_9a49d6b360dd391a2db4a4992881095b.jpg items :
		 * [{"desc":"置身这四季如画的青山绿水之间，暖汤私密时光，使这里成为一个远离喧嚣的世外桃源。"
		 * ,"name":"金隅凤山温泉，温泉湖光山色"
		 * ,"img":"u_fd4725f674d9b6e3198b65fed3c09e57.jpg"
		 * ,"label":"昌平区，景点","recommend"
		 * :{"id":"5603ef560cf255e649651834","priceRange"
		 * :[238,238],"expired":false
		 * ,"price":238,"fav":64,"lnglat":[116.283937,40.241448
		 * ],"label":"昌平区，景点","type":"scene","district":"昌平区"}},{"desc":
		 * "美人鱼温泉宫位于九华国际会展中心大酒店地下一层，拥有中式浴、藏式浴、人参浴、牛奶浴等十种特色温泉浴和水晶浴、木炭浴、玉石浴、玛瑙浴、光波浴等九种保健桑拿浴"
		 * ,"name":"来九华山美人宫泡温泉可好","img":"u_62536416282060941598b9d89cdfcc37.jpg"
		 * ,"label":"昌平区，景点","recommend":{"id":"5606234c0cf236e92fd54e81",
		 * "priceRange"
		 * :[85,85],"expired":false,"price":85,"fav":48,"lnglat":[116.417656
		 * ,40.179866
		 * ],"label":"昌平区，景点","type":"scene","district":"昌平区"}},{"desc":
		 * "度假村设计美轮美奂，达到四星标准，处处散发着恬静优雅的禅意。丰富多彩的温泉浴，温馨舒适的客房，设施齐备的会议室，精心烹制的各种美味佳肴."
		 * ,"name":"春晖园情侣套餐，过周末暖汤时光","img":
		 * "u_f0a1f29da7b144b1c9b27e9700eb3450.jpg"
		 * ,"label":"顺义区，景点","recommend":
		 * {"id":"560626f90cf236e92fd54e8d","priceRange"
		 * :[518,518],"expired":false
		 * ,"price":518,"fav":75,"lnglat":[116.4923,40.127793
		 * ],"label":"顺义区，景点","type":"scene","district":"顺义区"}},{"desc":
		 * "温泉水源自地下2000米深处，出水温度54摄氏度，水质优良，富含人体所需的氟、硫、铁、硅等多种矿物质及微量元素，具有特殊的保健和美肤功效。"
		 * ,"name":"北京金隅八达岭温泉度假村","img":"u_90a22178c122a4488204bba424acfedd.jpg"
		 * ,"label":"延庆县，景点","recommend":{"id":"561d146b0cf2e1c1ad6fc098",
		 * "priceRange"
		 * :[168,168],"expired":false,"price":168,"fav":59,"lnglat":[
		 * 115.973028,40.476028
		 * ],"label":"延庆县，景点","type":"scene","district":"延庆县"
		 * }},{"desc":"50多个温泉泡池高低错落，向人叙说着温泉文化的底蕴;室外温泉区的露天温泉泡池，让人与大自然亲密接触"
		 * ,"name":
		 * "温都水城的暖泉时光","img":"u_565fe5fc8d45000960c59e44115b6ccc.jpg","label"
		 * :"昌平区，景点"
		 * ,"recommend":{"id":"561e40600cf2b5a271d27904","priceRange":[128
		 * ,178],"expired"
		 * :false,"price":178,"fav":63,"lnglat":[116.371063,40.104018
		 * ],"label":"昌平区，景点" ,"type":"scene","district":"昌平区"}},{"desc":
		 * "温泉水滑洗凝脂，龙脉的暖汤时光，美好的你想不到" ,"name"
		 * :"龙脉温泉一日套餐，你准备好了么","img":"u_ad982beaac7c47a4002419a0ee45cf7b.jpg"
		 * ,"label"
		 * :"昌平区，景点","recommend":{"id":"561e4c410cf2b5a271d27927","priceRange"
		 * :[160,660],"expired":true,"price":340,"fav":34,"lnglat":[116.399723,
		 * 40.180738
		 * ],"label":"昌平区，景点","type":"scene","district":"昌平区"}},{"desc":
		 * "北京运河源温泉温泉井深达近3000米，水温较高。绝对适合周末一家人温馨泡汤"
		 * ,"name":"北京运河源温泉，通州的温泉汤生活","img"
		 * :"u_12798ed36943e845b7d3b99db883bb30.jpg"
		 * ,"label":"通州区，景点","recommend"
		 * :{"id":"561e51da0cf2b5a271d27987","priceRange"
		 * :[59,119],"expired":true
		 * ,"price":119,"fav":58,"lnglat":[116.683408,39.891362
		 * ],"label":"通州区，景点","type":"scene","district":"通州区"}},{"desc":
		 * "南宫温泉水世界近邻南宫世界地热博览园、温室公园、鹦鹉园、青龙湖、千灵山、泉怡园生态餐厅、南宫恒源商厦、超市、南宫天空城堡儿童乐园、南宫冰雪嘉年华。"
		 * ,"name":"南宫温泉水世界的冬汤生活","img":"u_9a49d6b360dd391a2db4a4992881095b.jpg"
		 * ,"label":"丰台区，景点","recommend":{"id":"561e58720cf2b5a271d279eb",
		 * "priceRange"
		 * :[130,145],"expired":false,"price":145,"fav":49,"lnglat":[
		 * 116.15406,39.80514
		 * ],"label":"丰台区，景点","type":"scene","district":"丰台区"}}] cityId : 1
		 * cityName : 北京 name : 下雪了，泡个暖汤可好 month : [1,2,11,12] subtitle :
		 * 温汤暖泉，好周末都在这里 isTop : 0 cityEnName : beijing type : 0 sname : 北京泡温泉
		 * modified : 1446776517753 id : 563c0ec70cf2a12275e05200 fav : 43 imgs
		 * : ["u_12798ed36943e845b7d3b99db883bb30.jpg",
		 * "u_9a49d6b360dd391a2db4a4992881095b.jpg"
		 * ,"u_ad982beaac7c47a4002419a0ee45cf7b.jpg"
		 * ,"u_565fe5fc8d45000960c59e44115b6ccc.jpg"]
		 */

		private List<ListEntity> list;

		public void setNumber(float number) {
			this.number = number;
		}

		public void setList(List<ListEntity> list) {
			this.list = list;
		}

		public float getNumber() {
			return number;
		}

		public List<ListEntity> getList() {
			return list;
		}

		public static class ListEntity {
			private String headImg;
			private float cityId;
			private String cityName;
			private String name;
			private String subtitle;
			private float isTop;
			private String cityEnName;
			private float type;
			private String sname;
			private long modified;
			private String id;
			private float fav;
			/**
			 * desc : 置身这四季如画的青山绿水之间，暖汤私密时光，使这里成为一个远离喧嚣的世外桃源。 name :
			 * 金隅凤山温泉，温泉湖光山色 img : u_fd4725f674d9b6e3198b65fed3c09e57.jpg label
			 * : 昌平区，景点 recommend :
			 * {"id":"5603ef560cf255e649651834","priceRange"
			 * :[238,238],"expired":
			 * false,"price":238,"fav":64,"lnglat":[116.283937
			 * ,40.241448],"label":"昌平区，景点","type":"scene","district":"昌平区"}
			 */

			private List<ItemsEntity> items;
			private List<Float> month;
			private List<String> imgs;

			public void setHeadImg(String headImg) {
				this.headImg = headImg;
			}

			public void setCityId(float cityId) {
				this.cityId = cityId;
			}

			public void setCityName(String cityName) {
				this.cityName = cityName;
			}

			public void setName(String name) {
				this.name = name;
			}

			public void setSubtitle(String subtitle) {
				this.subtitle = subtitle;
			}

			public void setIsTop(float isTop) {
				this.isTop = isTop;
			}

			public void setCityEnName(String cityEnName) {
				this.cityEnName = cityEnName;
			}

			public void setType(float type) {
				this.type = type;
			}

			public void setSname(String sname) {
				this.sname = sname;
			}

			public void setModified(long modified) {
				this.modified = modified;
			}

			public void setId(String id) {
				this.id = id;
			}

			public void setFav(float fav) {
				this.fav = fav;
			}

			public void setItems(List<ItemsEntity> items) {
				this.items = items;
			}

			public void setMonth(List<Float> month) {
				this.month = month;
			}

			public void setImgs(List<String> imgs) {
				this.imgs = imgs;
			}

			public String getHeadImg() {
				return headImg;
			}

			public float getCityId() {
				return cityId;
			}

			public String getCityName() {
				return cityName;
			}

			public String getName() {
				return name;
			}

			public String getSubtitle() {
				return subtitle;
			}

			public float getIsTop() {
				return isTop;
			}

			public String getCityEnName() {
				return cityEnName;
			}

			public float getType() {
				return type;
			}

			public String getSname() {
				return sname;
			}

			public long getModified() {
				return modified;
			}

			public String getId() {
				return id;
			}

			public float getFav() {
				return fav;
			}

			public List<ItemsEntity> getItems() {
				return items;
			}

			public List<Float> getMonth() {
				return month;
			}

			public List<String> getImgs() {
				return imgs;
			}

			public static class ItemsEntity {
				private String desc;
				private String name;
				private String img;
				private String label;
				/**
				 * id : 5603ef560cf255e649651834 priceRange : [238,238] expired
				 * : false price : 238 fav : 64 lnglat : [116.283937,40.241448]
				 * label : 昌平区，景点 type : scene district : 昌平区
				 */

				private RecommendEntity recommend;

				public void setDesc(String desc) {
					this.desc = desc;
				}

				public void setName(String name) {
					this.name = name;
				}

				public void setImg(String img) {
					this.img = img;
				}

				public void setLabel(String label) {
					this.label = label;
				}

				public void setRecommend(RecommendEntity recommend) {
					this.recommend = recommend;
				}

				public String getDesc() {
					return desc;
				}

				public String getName() {
					return name;
				}

				public String getImg() {
					return img;
				}

				public String getLabel() {
					return label;
				}

				public RecommendEntity getRecommend() {
					return recommend;
				}

				public static class RecommendEntity {
					private String id;
					private boolean expired;
					private float price;
					private float fav;
					private String label;
					private String type;
					private String district;
					private List<Float> priceRange;
					private List<Double> lnglat;

					public void setId(String id) {
						this.id = id;
					}

					public void setExpired(boolean expired) {
						this.expired = expired;
					}

					public void setPrice(float price) {
						this.price = price;
					}

					public void setFav(float fav) {
						this.fav = fav;
					}

					public void setLabel(String label) {
						this.label = label;
					}

					public void setType(String type) {
						this.type = type;
					}

					public void setDistrict(String district) {
						this.district = district;
					}

					public void setPriceRange(List<Float> priceRange) {
						this.priceRange = priceRange;
					}

					public void setLnglat(List<Double> lnglat) {
						this.lnglat = lnglat;
					}

					public String getId() {
						return id;
					}

					public boolean isExpired() {
						return expired;
					}

					public float getPrice() {
						return price;
					}

					public float getFav() {
						return fav;
					}

					public String getLabel() {
						return label;
					}

					public String getType() {
						return type;
					}

					public String getDistrict() {
						return district;
					}

					public List<Float> getPriceRange() {
						return priceRange;
					}

					public List<Double> getLnglat() {
						return lnglat;
					}
				}
			}
		}
	}
}
