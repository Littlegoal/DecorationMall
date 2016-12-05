<%--
  Created by IntelliJ IDEA.
  User: XinLian
  Date: 2016/12/3
  Time: 10:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <meta charset="UTF-8">
  <title>Title</title>
  <style type="text/css">
    *{
      -moz-box-sizing: border-box; /*Firefox3.5+*/
      -webkit-box-sizing: border-box; /*Safari3.2+*/
      -o-box-sizing: border-box; /*Opera9.6*/
      -ms-box-sizing: border-box; /*IE8*/
      box-sizing: border-box;
      /*font-family: webfont;*/
      font-family: "Microsoft Yahei",Heiti, arial,helvetica,sans-serif;
    }
  </style>
  <script>
    window._CONFIG_ = {
      goods_data_url : "/api/goods/",
      shop_data_url : "/api/shop/",
      debug : true
    };
    window._INIT_ = {
      fitmentList: [
        {
          className : "客厅",
          icon: "icon-stove",
          subClasses : [
            {name : "小类A", id : "suba"},
            {name : "小类B", id : "subb"},
            {name : "小类C", id : "subc"},
            {name : "小类D", id : "subd"},
            {name : "小类E", id : "sube"},
            {name : "小类F", id : "subf"},
            {name : "小类G", id : "subg"},
            {name : "小类H", id : "subh"}
          ],
          goods : [
            {
              id : 123,
              title : "合购家具",
              price: 2688,
              mainImg : "http://www.hetaojia.com/shop/hetao/index/2-1.jpg",
              storeInfo : {
                id: 12345,
                name : "店家名字"
              }
            },
            {
              title : "合购家具 欧式布艺沙发客厅简约小户型实木转角贵妃组合可拆洗",
              price: 2688,
              mainImg : "http://www.hetaojia.com/shop/hetao/index/2-1.jpg",
              storeInfo : {
                id: 12345,
                name : "店家名字"
              }
            },
            {
              title : "合购家具 欧式布艺沙发客厅简约小户型实木转角贵妃组合可拆洗",
              price: 2688,
              mainImg : "http://www.hetaojia.com/shop/hetao/index/2-1.jpg",
              storeInfo : {
                id: 12345,
                name : "店家名字"
              }
            },
            {
              title : "合购家具 欧式布艺沙发客厅简约小户型实木转角贵妃组合可拆洗",
              price: 2688,
              mainImg : "http://www.hetaojia.com/shop/hetao/index/2-1.jpg",
              storeInfo : {
                id: 12345,
                name : "店家名字"
              }
            },
            {
              title : "合购家具 欧式布艺沙发客厅简约小户型实木转角贵妃组合可拆洗",
              price: 2688,
              mainImg : "http://www.hetaojia.com/shop/hetao/index/2-1.jpg",
              storeInfo : {
                id: 12345,
                name : "店家名字"
              }
            },
            {
              title : "合购家具 欧式布艺沙发客厅简约小户型实木转角贵妃组合可拆洗",
              price: 2688,
              mainImg : "http://www.hetaojia.com/shop/hetao/index/2-1.jpg",
              storeInfo : {
                id: 12345,
                name : "店家名字"
              }
            }
          ]
        },
        {
          className : "卧室",
          icon: "icon-curtain",
          subClasses : [
            {name : "小类A", id : "suba"},
            {name : "小类B", id : "subb"},
            {name : "小类C", id : "subc"},
            {name : "小类D", id : "subd"},
            {name : "小类E", id : "sube"},
            {name : "小类F", id : "subf"},
            {name : "小类G", id : "subg"},
            {name : "小类H", id : "subh"}
          ],
          goods : [
            {
              title : "合购家具 欧式布艺沙发客厅简约小户型实木转角贵妃组合可拆洗",
              price: 2688,
              mainImg : "http://www.hetaojia.com/shop/hetao/index/2-1.jpg",
              storeInfo : {
                id: 12345,
                name : "店家名字"
              }
            },
            {
              title : "合购家具 欧式布艺沙发客厅简约小户型实木转角贵妃组合可拆洗",
              price: 2688,
              mainImg : "http://www.hetaojia.com/shop/hetao/index/2-1.jpg",
              storeInfo : {
                id: 12345,
                name : "店家名字"
              }
            },
            {
              title : "合购家具 欧式布艺沙发客厅简约小户型实木转角贵妃组合可拆洗",
              price: 2688,
              mainImg : "http://www.hetaojia.com/shop/hetao/index/2-1.jpg",
              storeInfo : {
                id: 12345,
                name : "店家名字"
              }
            },
            {
              title : "合购家具 欧式布艺沙发客厅简约小户型实木转角贵妃组合可拆洗",
              price: 2688,
              mainImg : "http://www.hetaojia.com/shop/hetao/index/2-1.jpg",
              storeInfo : {
                id: 12345,
                name : "店家名字"
              }
            },
            {
              title : "合购家具 欧式布艺沙发客厅简约小户型实木转角贵妃组合可拆洗",
              price: 2688,
              mainImg : "http://www.hetaojia.com/shop/hetao/index/2-1.jpg",
              storeInfo : {
                id: 12345,
                name : "店家名字"
              }
            },
            {
              title : "合购家具 欧式布艺沙发客厅简约小户型实木转角贵妃组合可拆洗",
              price: 2688,
              mainImg : "http://www.hetaojia.com/shop/hetao/index/2-1.jpg",
              storeInfo : {
                id: 12345,
                name : "店家名字"
              }
            }
          ]
        },
        {
          className : "书房",
          icon: "icon-lamp",
          subClasses : [
            {name : "小类A", id : "suba"},
            {name : "小类B", id : "subb"},
            {name : "小类C", id : "subc"},
            {name : "小类D", id : "subd"},
            {name : "小类E", id : "sube"},
            {name : "小类F", id : "subf"},
            {name : "小类G", id : "subg"},
            {name : "小类H", id : "subh"}
          ],
          goods : [
            {
              title : "合购家具 欧式布艺沙发客厅简约小户型实木转角贵妃组合可拆洗",
              price: 2688,
              mainImg : "http://www.hetaojia.com/shop/hetao/index/2-1.jpg",
              storeInfo : {
                id: 12345,
                name : "店家名字"
              }
            },
            {
              title : "合购家具 欧式布艺沙发客厅简约小户型实木转角贵妃组合可拆洗",
              price: 2688,
              mainImg : "http://www.hetaojia.com/shop/hetao/index/2-1.jpg",
              storeInfo : {
                id: 12345,
                name : "店家名字"
              }
            },
            {
              title : "合购家具 欧式布艺沙发客厅简约小户型实木转角贵妃组合可拆洗",
              price: 2688,
              mainImg : "http://www.hetaojia.com/shop/hetao/index/2-1.jpg",
              storeInfo : {
                id: 12345,
                name : "店家名字"
              }
            },
            {
              title : "合购家具 欧式布艺沙发客厅简约小户型实木转角贵妃组合可拆洗",
              price: 2688,
              mainImg : "http://www.hetaojia.com/shop/hetao/index/2-1.jpg",
              storeInfo : {
                id: 12345,
                name : "店家名字"
              }
            },
            {
              title : "合购家具 欧式布艺沙发客厅简约小户型实木转角贵妃组合可拆洗",
              price: 2688,
              mainImg : "http://www.hetaojia.com/shop/hetao/index/2-1.jpg",
              storeInfo : {
                id: 12345,
                name : "店家名字"
              }
            },
            {
              title : "合购家具 欧式布艺沙发客厅简约小户型实木转角贵妃组合可拆洗",
              price: 2688,
              mainImg : "http://www.hetaojia.com/shop/hetao/index/2-1.jpg",
              storeInfo : {
                id: 12345,
                name : "店家名字"
              }
            }
          ]
        },
        {
          className : "餐厅",
          icon: "icon-chair",
          subClasses : [
            {name : "小类A", id : "suba"},
            {name : "小类B", id : "subb"},
            {name : "小类C", id : "subc"},
            {name : "小类D", id : "subd"},
            {name : "小类E", id : "sube"},
            {name : "小类F", id : "subf"},
            {name : "小类G", id : "subg"},
            {name : "小类H", id : "subh"}
          ],
          goods : [
            {
              title : "合购家具 欧式布艺沙发客厅简约小户型实木转角贵妃组合可拆洗",
              price: 2688,
              mainImg : "http://www.hetaojia.com/shop/hetao/index/2-1.jpg",
              storeInfo : {
                id: 12345,
                name : "店家名字"
              }
            },
            {
              title : "合购家具 欧式布艺沙发客厅简约小户型实木转角贵妃组合可拆洗",
              price: 2688,
              mainImg : "http://www.hetaojia.com/shop/hetao/index/2-1.jpg",
              storeInfo : {
                id: 12345,
                name : "店家名字"
              }
            },
            {
              title : "合购家具 欧式布艺沙发客厅简约小户型实木转角贵妃组合可拆洗",
              price: 2688,
              mainImg : "http://www.hetaojia.com/shop/hetao/index/2-1.jpg",
              storeInfo : {
                id: 12345,
                name : "店家名字"
              }
            },
            {
              title : "合购家具 欧式布艺沙发客厅简约小户型实木转角贵妃组合可拆洗",
              price: 2688,
              mainImg : "http://www.hetaojia.com/shop/hetao/index/2-1.jpg",
              storeInfo : {
                id: 12345,
                name : "店家名字"
              }
            },
            {
              title : "合购家具 欧式布艺沙发客厅简约小户型实木转角贵妃组合可拆洗",
              price: 2688,
              mainImg : "http://www.hetaojia.com/shop/hetao/index/2-1.jpg",
              storeInfo : {
                id: 12345,
                name : "店家名字"
              }
            },
            {
              title : "合购家具 欧式布艺沙发客厅简约小户型实木转角贵妃组合可拆洗",
              price: 2688,
              mainImg : "http://www.hetaojia.com/shop/hetao/index/2-1.jpg",
              storeInfo : {
                id: 12345,
                name : "店家名字"
              }
            }
          ]
        },
        {
          className : "卫浴",
          icon: "icon-bathroom",
          subClasses : [
            {name : "小类A", id : "suba"},
            {name : "小类B", id : "subb"},
            {name : "小类C", id : "subc"},
            {name : "小类D", id : "subd"},
            {name : "小类E", id : "sube"},
            {name : "小类F", id : "subf"},
            {name : "小类G", id : "subg"},
            {name : "小类H", id : "subh"}
          ],
          goods : [
            {
              title : "合购家具 欧式布艺沙发客厅简约小户型实木转角贵妃组合可拆洗",
              price: 2688,
              mainImg : "http://www.hetaojia.com/shop/hetao/index/2-1.jpg",
              storeInfo : {
                id: 12345,
                name : "店家名字"
              }
            },
            {
              title : "合购家具 欧式布艺沙发客厅简约小户型实木转角贵妃组合可拆洗",
              price: 2688,
              mainImg : "http://www.hetaojia.com/shop/hetao/index/2-1.jpg",
              storeInfo : {
                id: 12345,
                name : "店家名字"
              }
            },
            {
              title : "合购家具 欧式布艺沙发客厅简约小户型实木转角贵妃组合可拆洗",
              price: 2688,
              mainImg : "http://www.hetaojia.com/shop/hetao/index/2-1.jpg",
              storeInfo : {
                id: 12345,
                name : "店家名字"
              }
            },
            {
              title : "合购家具 欧式布艺沙发客厅简约小户型实木转角贵妃组合可拆洗",
              price: 2688,
              mainImg : "http://www.hetaojia.com/shop/hetao/index/2-1.jpg",
              storeInfo : {
                id: 12345,
                name : "店家名字"
              }
            },
            {
              title : "合购家具 欧式布艺沙发客厅简约小户型实木转角贵妃组合可拆洗",
              price: 2688,
              mainImg : "http://www.hetaojia.com/shop/hetao/index/2-1.jpg",
              storeInfo : {
                id: 12345,
                name : "店家名字"
              }
            },
            {
              title : "合购家具 欧式布艺沙发客厅简约小户型实木转角贵妃组合可拆洗",
              price: 2688,
              mainImg : "http://www.hetaojia.com/shop/hetao/index/2-1.jpg",
              storeInfo : {
                id: 12345,
                name : "店家名字"
              }
            }
          ]
        },
        {
          className : "厨房",
          icon: "icon-kitchen",
          subClasses : [
            {name : "小类A", id : "suba"},
            {name : "小类B", id : "subb"},
            {name : "小类C", id : "subc"},
            {name : "小类D", id : "subd"},
            {name : "小类E", id : "sube"},
            {name : "小类F", id : "subf"},
            {name : "小类G", id : "subg"},
            {name : "小类H", id : "subh"}
          ],
          goods : [
            {
              title : "合购家具 欧式布艺沙发客厅简约小户型实木转角贵妃组合可拆洗",
              price: 2688,
              mainImg : "http://www.hetaojia.com/shop/hetao/index/2-1.jpg",
              storeInfo : {
                id: 12345,
                name : "店家名字"
              }
            },
            {
              title : "合购家具 欧式布艺沙发客厅简约小户型实木转角贵妃组合可拆洗",
              price: 2688,
              mainImg : "http://www.hetaojia.com/shop/hetao/index/2-1.jpg",
              storeInfo : {
                id: 12345,
                name : "店家名字"
              }
            },
            {
              title : "合购家具 欧式布艺沙发客厅简约小户型实木转角贵妃组合可拆洗",
              price: 2688,
              mainImg : "http://www.hetaojia.com/shop/hetao/index/2-1.jpg",
              storeInfo : {
                id: 12345,
                name : "店家名字"
              }
            },
            {
              title : "合购家具 欧式布艺沙发客厅简约小户型实木转角贵妃组合可拆洗",
              price: 2688,
              mainImg : "http://www.hetaojia.com/shop/hetao/index/2-1.jpg",
              storeInfo : {
                id: 12345,
                name : "店家名字"
              }
            },
            {
              title : "合购家具 欧式布艺沙发客厅简约小户型实木转角贵妃组合可拆洗",
              price: 2688,
              mainImg : "http://www.hetaojia.com/shop/hetao/index/2-1.jpg",
              storeInfo : {
                id: 12345,
                name : "店家名字"
              }
            },
            {
              title : "合购家具 欧式布艺沙发客厅简约小户型实木转角贵妃组合可拆洗",
              price: 2688,
              mainImg : "http://www.hetaojia.com/shop/hetao/index/2-1.jpg",
              storeInfo : {
                id: 12345,
                name : "店家名字"
              }
            }
          ]
        },
        {
          className : "儿童",
          icon: "icon-house",
          subClasses : [
            {name : "小类A", id : "suba"},
            {name : "小类B", id : "subb"},
            {name : "小类C", id : "subc"},
            {name : "小类D", id : "subd"},
            {name : "小类E", id : "sube"},
            {name : "小类F", id : "subf"},
            {name : "小类G", id : "subg"},
            {name : "小类H", id : "subh"}
          ],
          goods : [
            {
              title : "合购家具 欧式布艺沙发客厅简约小户型实木转角贵妃组合可拆洗",
              price: 2688,
              mainImg : "http://www.hetaojia.com/shop/hetao/index/2-1.jpg",
              storeInfo : {
                id: 12345,
                name : "店家名字"
              }
            },
            {
              title : "合购家具 欧式布艺沙发客厅简约小户型实木转角贵妃组合可拆洗",
              price: 2688,
              mainImg : "http://www.hetaojia.com/shop/hetao/index/2-1.jpg",
              storeInfo : {
                id: 12345,
                name : "店家名字"
              }
            },
            {
              title : "合购家具 欧式布艺沙发客厅简约小户型实木转角贵妃组合可拆洗",
              price: 2688,
              mainImg : "http://www.hetaojia.com/shop/hetao/index/2-1.jpg",
              storeInfo : {
                id: 12345,
                name : "店家名字"
              }
            },
            {
              title : "合购家具 欧式布艺沙发客厅简约小户型实木转角贵妃组合可拆洗",
              price: 2688,
              mainImg : "http://www.hetaojia.com/shop/hetao/index/2-1.jpg",
              storeInfo : {
                id: 12345,
                name : "店家名字"
              }
            },
            {
              title : "合购家具 欧式布艺沙发客厅简约小户型实木转角贵妃组合可拆洗",
              price: 2688,
              mainImg : "http://www.hetaojia.com/shop/hetao/index/2-1.jpg",
              storeInfo : {
                id: 12345,
                name : "店家名字"
              }
            },
            {
              title : "合购家具 欧式布艺沙发客厅简约小户型实木转角贵妃组合可拆洗",
              price: 2688,
              mainImg : "http://www.hetaojia.com/shop/hetao/index/2-1.jpg",
              storeInfo : {
                id: 12345,
                name : "店家名字"
              }
            }
          ]
        },
        {
          className : "全屋定制",
          icon: "icon-stove",
          subClasses : [
            {name : "小类A", id : "suba"},
            {name : "小类B", id : "subb"},
            {name : "小类C", id : "subc"},
            {name : "小类D", id : "subd"},
            {name : "小类E", id : "sube"},
            {name : "小类F", id : "subf"},
            {name : "小类G", id : "subg"},
            {name : "小类H", id : "subh"}
          ],
          goods : [
            {
              title : "合购家具 欧式布艺沙发客厅简约小户型实木转角贵妃组合可拆洗",
              price: 2688,
              mainImg : "http://www.hetaojia.com/shop/hetao/index/2-1.jpg",
              storeInfo : {
                id: 12345,
                name : "店家名字"
              }
            },
            {
              title : "合购家具 欧式布艺沙发客厅简约小户型实木转角贵妃组合可拆洗",
              price: 2688,
              mainImg : "http://www.hetaojia.com/shop/hetao/index/2-1.jpg",
              storeInfo : {
                id: 12345,
                name : "店家名字"
              }
            },
            {
              title : "合购家具 欧式布艺沙发客厅简约小户型实木转角贵妃组合可拆洗",
              price: 2688,
              mainImg : "http://www.hetaojia.com/shop/hetao/index/2-1.jpg",
              storeInfo : {
                id: 12345,
                name : "店家名字"
              }
            },
            {
              title : "合购家具 欧式布艺沙发客厅简约小户型实木转角贵妃组合可拆洗",
              price: 2688,
              mainImg : "http://www.hetaojia.com/shop/hetao/index/2-1.jpg",
              storeInfo : {
                id: 12345,
                name : "店家名字"
              }
            },
            {
              title : "合购家具 欧式布艺沙发客厅简约小户型实木转角贵妃组合可拆洗",
              price: 2688,
              mainImg : "http://www.hetaojia.com/shop/hetao/index/2-1.jpg",
              storeInfo : {
                id: 12345,
                name : "店家名字"
              }
            },
            {
              title : "合购家具 欧式布艺沙发客厅简约小户型实木转角贵妃组合可拆洗",
              price: 2688,
              mainImg : "http://www.hetaojia.com/shop/hetao/index/2-1.jpg",
              storeInfo : {
                id: 12345,
                name : "店家名字"
              }
            }
          ]
        }

      ],

      searchResult : {
        keyword : "朝阳 家具店",
        category : "shop",
        count : 4,
        items : [
          {
            id: 12345,
            name : "店家名字店家名字",
            address : "12345",
            contact: "021-87253232",
            goods : ["家具", "床品", "卧室用品"],
            goodsCount : 233,
            img: ""
          }
        ],
        hasMore : false
      }
    };
  </script>
</head>
<body>
<div id="content"></div>
<!--<script src="http://localhost:8080/webpack-dev-server.js"></script>-->
<script src="http://45.32.56.238:8080/main.bundle.js" ></script>
<!--<script src="https://raw.githubusercontent.com/shellming/fitmentFrontEnd/master/main.bundle.js" ></script>-->
</body>
</html>
