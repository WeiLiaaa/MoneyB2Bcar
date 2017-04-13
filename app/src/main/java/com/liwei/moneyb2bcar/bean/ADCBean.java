package com.liwei.moneyb2bcar.bean;

import java.util.List;

/**
 * Created by wu  suo  wei on 2017/4/13.
 */

public class ADCBean {

    /**
     * code : 200
     * datas : [{"home1":{"data":"","image":"http://www.htyyao.com/data/upload/mobile/special/s36/s36_05452989179536919.jpg","title":"","type":""}},{"goods":{"item":[{"drug_spec":"25mg*20片","goods_id":"116515","goods_image":"http://www.htyyao.com/data/upload/shop/store/goods/14/14_05440971368753475_240.jpeg","goods_name":"硫酸氢氯吡格雷片(泰嘉)-FF20161210","goods_price":"68.50","goods_promotion_price":"68.50","product_company":"深圳信立泰药业股份有限公司"},{"drug_spec":"0.15g*7片","goods_id":"117959","goods_image":"http://www.htyyao.com/data/upload/shop/store/goods/14/14_05193889285379575_240.jpg","goods_name":"厄贝沙坦片(吉加)-16071651","goods_price":"7.50","goods_promotion_price":"7.60","product_company":"江苏恒瑞医药股份有限公司"},{"drug_spec":"10mg*7片","goods_id":"102517","goods_image":"http://www.htyyao.com/data/upload/shop/store/goods/14/14_05440973588274044_240.jpeg","goods_name":"阿托伐他汀钙片(阿乐)-161035","goods_price":"22.30","goods_promotion_price":"22.30","product_company":"北京嘉林药业股份有限公司"},{"drug_spec":"20mg*7片","goods_id":"119553","goods_image":"http://www.htyyao.com/data/upload/shop/store/goods/14/14_05440972517175062_240.jpeg","goods_name":"阿托伐他汀钙片（阿乐）-161201","goods_price":"37.20","goods_promotion_price":"37.20","product_company":"北京嘉林药业股份有限公司"},{"drug_spec":"50μg*50s","goods_id":"103892","goods_image":"http://www.htyyao.com/data/upload/shop/store/goods/14/14_05440964355063592_240.jpeg","goods_name":"左甲状腺素钠片（雷替斯）-61009","goods_price":"27.80","goods_promotion_price":"27.80","product_company":"Berlin-Chemie AG"},{"drug_spec":"25mg*20片","goods_id":"117058","goods_image":"http://www.htyyao.com/data/upload/shop/store/goods/14/14_05064507702462257_240.jpg","goods_name":"酒石酸美托洛尔片（倍他乐克）-1608A01","goods_price":"6.85","goods_promotion_price":"6.85","product_company":"阿斯利康制药有限公司"},{"drug_spec":"120喷","goods_id":"118294","goods_image":"http://www.htyyao.com/data/upload/shop/store/goods/14/14_05061868968282632_240.jpg","goods_name":"丙酸氟替卡松鼻喷雾剂(辅舒良)-B2B","goods_price":"66.50","goods_promotion_price":"67.50","product_company":"葛兰素史克"},{"drug_spec":"50ug/100片","goods_id":"108355","goods_image":"http://www.htyyao.com/data/upload/shop/store/goods/14/14_05198357597037374_240.jpg","goods_name":"左甲状腺素钠片（优甲乐）-208174","goods_price":"30.50","goods_promotion_price":"30.50","product_company":"德国默克"},{"drug_spec":"0.25g*20粒","goods_id":"104066","goods_image":"http://www.htyyao.com/data/upload/shop/store/goods/14/14_05064451531912358_240.jpg","goods_name":"地衣芽孢杆菌活菌胶囊（整肠生）-201510146","goods_price":"16.80","goods_promotion_price":"16.80","product_company":"东北制药有限公司"},{"drug_spec":"0.1g*30片","goods_id":"113657","goods_image":"http://www.htyyao.com/data/upload/shop/store/goods/14/14_05112948392351430_240.jpg","goods_name":"阿司匹林肠溶片（拜阿司匹林）-B2B","goods_price":"14.55","goods_promotion_price":"15.00","product_company":"拜耳医药保健有限公司"},{"drug_spec":"10片","goods_id":"122443","goods_image":"http://www.htyyao.com/data/upload/shop/store/goods/14/14_05300958454047003_240.jpeg","goods_name":"氨酚咖匹林片-1610122","goods_price":"3.50","goods_promotion_price":"3.55","product_company":"天津力生制药股份有限公司"},{"drug_spec":"0.15mg*21片","goods_id":"125815","goods_image":"http://www.htyyao.com/data/upload/shop/store/goods/14/14_05362630437743377_240.jpeg","goods_name":"去氧孕烯炔雌醇片(妈富隆）-M031257","goods_price":"35.00","goods_promotion_price":"36.00","product_company":"荷兰欧加农公司"},{"drug_spec":"30mg*7片","goods_id":"103844","goods_image":"http://www.htyyao.com/data/upload/shop/store/goods/14/14_05077500099387206_240.jpg","goods_name":"硝苯地平控释片(拜新同)-BJ26402","goods_price":"31.50","goods_promotion_price":"31.50","product_company":"拜耳医药保健有限公司"},{"drug_spec":"0.5mg*7片","goods_id":"102643","goods_image":"http://www.htyyao.com/data/upload/shop/store/goods/14/14_05440974309158171_240.jpeg","goods_name":"恩替卡韦片(博路定)-AAD8097","goods_price":"216.00","goods_promotion_price":"216.00","product_company":"中美上海施贵宝制药有限公司"},{"drug_spec":"0.5mg*7片","goods_id":"120488","goods_image":"http://www.htyyao.com/data/upload/shop/store/goods/14/14_05290873838768483_240.jpg","goods_name":"恩替卡韦分散片-154545","goods_price":"70.20","goods_promotion_price":"70.20","product_company":"海南中和药业有限公司"},{"drug_spec":"7g","goods_id":"120614","goods_image":"http://www.htyyao.com/data/upload/shop/store/goods/14/14_05307886293341946_240.jpg","goods_name":"复方酮康唑软膏（皮康王）-B2B","goods_price":"4.35","goods_promotion_price":"4.54","product_company":"昆明滇虹药业有限公司"}],"title":""}}]
     */

    private int code;
    private List<DatasBean> datas;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public List<DatasBean> getDatas() {
        return datas;
    }

    public void setDatas(List<DatasBean> datas) {
        this.datas = datas;
    }

    public static class DatasBean {
        /**
         * home1 : {"data":"","image":"http://www.htyyao.com/data/upload/mobile/special/s36/s36_05452989179536919.jpg","title":"","type":""}
         * goods : {"item":[{"drug_spec":"25mg*20片","goods_id":"116515","goods_image":"http://www.htyyao.com/data/upload/shop/store/goods/14/14_05440971368753475_240.jpeg","goods_name":"硫酸氢氯吡格雷片(泰嘉)-FF20161210","goods_price":"68.50","goods_promotion_price":"68.50","product_company":"深圳信立泰药业股份有限公司"},{"drug_spec":"0.15g*7片","goods_id":"117959","goods_image":"http://www.htyyao.com/data/upload/shop/store/goods/14/14_05193889285379575_240.jpg","goods_name":"厄贝沙坦片(吉加)-16071651","goods_price":"7.50","goods_promotion_price":"7.60","product_company":"江苏恒瑞医药股份有限公司"},{"drug_spec":"10mg*7片","goods_id":"102517","goods_image":"http://www.htyyao.com/data/upload/shop/store/goods/14/14_05440973588274044_240.jpeg","goods_name":"阿托伐他汀钙片(阿乐)-161035","goods_price":"22.30","goods_promotion_price":"22.30","product_company":"北京嘉林药业股份有限公司"},{"drug_spec":"20mg*7片","goods_id":"119553","goods_image":"http://www.htyyao.com/data/upload/shop/store/goods/14/14_05440972517175062_240.jpeg","goods_name":"阿托伐他汀钙片（阿乐）-161201","goods_price":"37.20","goods_promotion_price":"37.20","product_company":"北京嘉林药业股份有限公司"},{"drug_spec":"50μg*50s","goods_id":"103892","goods_image":"http://www.htyyao.com/data/upload/shop/store/goods/14/14_05440964355063592_240.jpeg","goods_name":"左甲状腺素钠片（雷替斯）-61009","goods_price":"27.80","goods_promotion_price":"27.80","product_company":"Berlin-Chemie AG"},{"drug_spec":"25mg*20片","goods_id":"117058","goods_image":"http://www.htyyao.com/data/upload/shop/store/goods/14/14_05064507702462257_240.jpg","goods_name":"酒石酸美托洛尔片（倍他乐克）-1608A01","goods_price":"6.85","goods_promotion_price":"6.85","product_company":"阿斯利康制药有限公司"},{"drug_spec":"120喷","goods_id":"118294","goods_image":"http://www.htyyao.com/data/upload/shop/store/goods/14/14_05061868968282632_240.jpg","goods_name":"丙酸氟替卡松鼻喷雾剂(辅舒良)-B2B","goods_price":"66.50","goods_promotion_price":"67.50","product_company":"葛兰素史克"},{"drug_spec":"50ug/100片","goods_id":"108355","goods_image":"http://www.htyyao.com/data/upload/shop/store/goods/14/14_05198357597037374_240.jpg","goods_name":"左甲状腺素钠片（优甲乐）-208174","goods_price":"30.50","goods_promotion_price":"30.50","product_company":"德国默克"},{"drug_spec":"0.25g*20粒","goods_id":"104066","goods_image":"http://www.htyyao.com/data/upload/shop/store/goods/14/14_05064451531912358_240.jpg","goods_name":"地衣芽孢杆菌活菌胶囊（整肠生）-201510146","goods_price":"16.80","goods_promotion_price":"16.80","product_company":"东北制药有限公司"},{"drug_spec":"0.1g*30片","goods_id":"113657","goods_image":"http://www.htyyao.com/data/upload/shop/store/goods/14/14_05112948392351430_240.jpg","goods_name":"阿司匹林肠溶片（拜阿司匹林）-B2B","goods_price":"14.55","goods_promotion_price":"15.00","product_company":"拜耳医药保健有限公司"},{"drug_spec":"10片","goods_id":"122443","goods_image":"http://www.htyyao.com/data/upload/shop/store/goods/14/14_05300958454047003_240.jpeg","goods_name":"氨酚咖匹林片-1610122","goods_price":"3.50","goods_promotion_price":"3.55","product_company":"天津力生制药股份有限公司"},{"drug_spec":"0.15mg*21片","goods_id":"125815","goods_image":"http://www.htyyao.com/data/upload/shop/store/goods/14/14_05362630437743377_240.jpeg","goods_name":"去氧孕烯炔雌醇片(妈富隆）-M031257","goods_price":"35.00","goods_promotion_price":"36.00","product_company":"荷兰欧加农公司"},{"drug_spec":"30mg*7片","goods_id":"103844","goods_image":"http://www.htyyao.com/data/upload/shop/store/goods/14/14_05077500099387206_240.jpg","goods_name":"硝苯地平控释片(拜新同)-BJ26402","goods_price":"31.50","goods_promotion_price":"31.50","product_company":"拜耳医药保健有限公司"},{"drug_spec":"0.5mg*7片","goods_id":"102643","goods_image":"http://www.htyyao.com/data/upload/shop/store/goods/14/14_05440974309158171_240.jpeg","goods_name":"恩替卡韦片(博路定)-AAD8097","goods_price":"216.00","goods_promotion_price":"216.00","product_company":"中美上海施贵宝制药有限公司"},{"drug_spec":"0.5mg*7片","goods_id":"120488","goods_image":"http://www.htyyao.com/data/upload/shop/store/goods/14/14_05290873838768483_240.jpg","goods_name":"恩替卡韦分散片-154545","goods_price":"70.20","goods_promotion_price":"70.20","product_company":"海南中和药业有限公司"},{"drug_spec":"7g","goods_id":"120614","goods_image":"http://www.htyyao.com/data/upload/shop/store/goods/14/14_05307886293341946_240.jpg","goods_name":"复方酮康唑软膏（皮康王）-B2B","goods_price":"4.35","goods_promotion_price":"4.54","product_company":"昆明滇虹药业有限公司"}],"title":""}
         */

        private Home1Bean home1;
        private GoodsBean goods;

        public Home1Bean getHome1() {
            return home1;
        }

        public void setHome1(Home1Bean home1) {
            this.home1 = home1;
        }

        public GoodsBean getGoods() {
            return goods;
        }

        public void setGoods(GoodsBean goods) {
            this.goods = goods;
        }

        public static class Home1Bean {
            /**
             * data :
             * image : http://www.htyyao.com/data/upload/mobile/special/s36/s36_05452989179536919.jpg
             * title :
             * type :
             */

            private String data;
            private String image;
            private String title;
            private String type;

            public String getData() {
                return data;
            }

            public void setData(String data) {
                this.data = data;
            }

            public String getImage() {
                return image;
            }

            public void setImage(String image) {
                this.image = image;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }
        }

        public static class GoodsBean {
            /**
             * item : [{"drug_spec":"25mg*20片","goods_id":"116515","goods_image":"http://www.htyyao.com/data/upload/shop/store/goods/14/14_05440971368753475_240.jpeg","goods_name":"硫酸氢氯吡格雷片(泰嘉)-FF20161210","goods_price":"68.50","goods_promotion_price":"68.50","product_company":"深圳信立泰药业股份有限公司"},{"drug_spec":"0.15g*7片","goods_id":"117959","goods_image":"http://www.htyyao.com/data/upload/shop/store/goods/14/14_05193889285379575_240.jpg","goods_name":"厄贝沙坦片(吉加)-16071651","goods_price":"7.50","goods_promotion_price":"7.60","product_company":"江苏恒瑞医药股份有限公司"},{"drug_spec":"10mg*7片","goods_id":"102517","goods_image":"http://www.htyyao.com/data/upload/shop/store/goods/14/14_05440973588274044_240.jpeg","goods_name":"阿托伐他汀钙片(阿乐)-161035","goods_price":"22.30","goods_promotion_price":"22.30","product_company":"北京嘉林药业股份有限公司"},{"drug_spec":"20mg*7片","goods_id":"119553","goods_image":"http://www.htyyao.com/data/upload/shop/store/goods/14/14_05440972517175062_240.jpeg","goods_name":"阿托伐他汀钙片（阿乐）-161201","goods_price":"37.20","goods_promotion_price":"37.20","product_company":"北京嘉林药业股份有限公司"},{"drug_spec":"50μg*50s","goods_id":"103892","goods_image":"http://www.htyyao.com/data/upload/shop/store/goods/14/14_05440964355063592_240.jpeg","goods_name":"左甲状腺素钠片（雷替斯）-61009","goods_price":"27.80","goods_promotion_price":"27.80","product_company":"Berlin-Chemie AG"},{"drug_spec":"25mg*20片","goods_id":"117058","goods_image":"http://www.htyyao.com/data/upload/shop/store/goods/14/14_05064507702462257_240.jpg","goods_name":"酒石酸美托洛尔片（倍他乐克）-1608A01","goods_price":"6.85","goods_promotion_price":"6.85","product_company":"阿斯利康制药有限公司"},{"drug_spec":"120喷","goods_id":"118294","goods_image":"http://www.htyyao.com/data/upload/shop/store/goods/14/14_05061868968282632_240.jpg","goods_name":"丙酸氟替卡松鼻喷雾剂(辅舒良)-B2B","goods_price":"66.50","goods_promotion_price":"67.50","product_company":"葛兰素史克"},{"drug_spec":"50ug/100片","goods_id":"108355","goods_image":"http://www.htyyao.com/data/upload/shop/store/goods/14/14_05198357597037374_240.jpg","goods_name":"左甲状腺素钠片（优甲乐）-208174","goods_price":"30.50","goods_promotion_price":"30.50","product_company":"德国默克"},{"drug_spec":"0.25g*20粒","goods_id":"104066","goods_image":"http://www.htyyao.com/data/upload/shop/store/goods/14/14_05064451531912358_240.jpg","goods_name":"地衣芽孢杆菌活菌胶囊（整肠生）-201510146","goods_price":"16.80","goods_promotion_price":"16.80","product_company":"东北制药有限公司"},{"drug_spec":"0.1g*30片","goods_id":"113657","goods_image":"http://www.htyyao.com/data/upload/shop/store/goods/14/14_05112948392351430_240.jpg","goods_name":"阿司匹林肠溶片（拜阿司匹林）-B2B","goods_price":"14.55","goods_promotion_price":"15.00","product_company":"拜耳医药保健有限公司"},{"drug_spec":"10片","goods_id":"122443","goods_image":"http://www.htyyao.com/data/upload/shop/store/goods/14/14_05300958454047003_240.jpeg","goods_name":"氨酚咖匹林片-1610122","goods_price":"3.50","goods_promotion_price":"3.55","product_company":"天津力生制药股份有限公司"},{"drug_spec":"0.15mg*21片","goods_id":"125815","goods_image":"http://www.htyyao.com/data/upload/shop/store/goods/14/14_05362630437743377_240.jpeg","goods_name":"去氧孕烯炔雌醇片(妈富隆）-M031257","goods_price":"35.00","goods_promotion_price":"36.00","product_company":"荷兰欧加农公司"},{"drug_spec":"30mg*7片","goods_id":"103844","goods_image":"http://www.htyyao.com/data/upload/shop/store/goods/14/14_05077500099387206_240.jpg","goods_name":"硝苯地平控释片(拜新同)-BJ26402","goods_price":"31.50","goods_promotion_price":"31.50","product_company":"拜耳医药保健有限公司"},{"drug_spec":"0.5mg*7片","goods_id":"102643","goods_image":"http://www.htyyao.com/data/upload/shop/store/goods/14/14_05440974309158171_240.jpeg","goods_name":"恩替卡韦片(博路定)-AAD8097","goods_price":"216.00","goods_promotion_price":"216.00","product_company":"中美上海施贵宝制药有限公司"},{"drug_spec":"0.5mg*7片","goods_id":"120488","goods_image":"http://www.htyyao.com/data/upload/shop/store/goods/14/14_05290873838768483_240.jpg","goods_name":"恩替卡韦分散片-154545","goods_price":"70.20","goods_promotion_price":"70.20","product_company":"海南中和药业有限公司"},{"drug_spec":"7g","goods_id":"120614","goods_image":"http://www.htyyao.com/data/upload/shop/store/goods/14/14_05307886293341946_240.jpg","goods_name":"复方酮康唑软膏（皮康王）-B2B","goods_price":"4.35","goods_promotion_price":"4.54","product_company":"昆明滇虹药业有限公司"}]
             * title :
             */

            private String title;
            private List<ItemBean> item;

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public List<ItemBean> getItem() {
                return item;
            }

            public void setItem(List<ItemBean> item) {
                this.item = item;
            }

            public static class ItemBean {
                /**
                 * drug_spec : 25mg*20片
                 * goods_id : 116515
                 * goods_image : http://www.htyyao.com/data/upload/shop/store/goods/14/14_05440971368753475_240.jpeg
                 * goods_name : 硫酸氢氯吡格雷片(泰嘉)-FF20161210
                 * goods_price : 68.50
                 * goods_promotion_price : 68.50
                 * product_company : 深圳信立泰药业股份有限公司
                 */

                private String drug_spec;
                private String goods_id;
                private String goods_image;
                private String goods_name;
                private String goods_price;
                private String goods_promotion_price;
                private String product_company;

                public String getDrug_spec() {
                    return drug_spec;
                }

                public void setDrug_spec(String drug_spec) {
                    this.drug_spec = drug_spec;
                }

                public String getGoods_id() {
                    return goods_id;
                }

                public void setGoods_id(String goods_id) {
                    this.goods_id = goods_id;
                }

                public String getGoods_image() {
                    return goods_image;
                }

                public void setGoods_image(String goods_image) {
                    this.goods_image = goods_image;
                }

                public String getGoods_name() {
                    return goods_name;
                }

                public void setGoods_name(String goods_name) {
                    this.goods_name = goods_name;
                }

                public String getGoods_price() {
                    return goods_price;
                }

                public void setGoods_price(String goods_price) {
                    this.goods_price = goods_price;
                }

                public String getGoods_promotion_price() {
                    return goods_promotion_price;
                }

                public void setGoods_promotion_price(String goods_promotion_price) {
                    this.goods_promotion_price = goods_promotion_price;
                }

                public String getProduct_company() {
                    return product_company;
                }

                public void setProduct_company(String product_company) {
                    this.product_company = product_company;
                }
            }
        }
    }
}
