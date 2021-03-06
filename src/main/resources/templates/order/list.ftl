<html>
    <head>
        <meta charset="UTF-8">
        <title>卖家商店列表</title>
         <#include "../common/head.ftl">
    </head>
    <body>
    <div id="wrapper" class="toggled">
        <#--边栏-->
        <#include "../common/nav.ftl">
        <#--主要内容Content-->
        <div id="page-content-wrapper">
            <div class="container-fluid">
                <div class="row clearfix">
                    <div class="col-md-12 column">
                        <table class="table table-bordered table-condensed">
                            <thead>
                            <tr>
                                <th>订单ID</th>
                                <th>姓名</th>
                                <th>手机号</th>
                                <th>地址</th>
                                <th>金额</th>
                                <th>订单状态</th>
                                <th>支付状态</th>
                                <th>创建时间</th>
                                <th colspan="2">操作</th>
                            </tr>
                            </thead>
                            <tbody>
                        <#list orderDTOPage.content as orderDTO>
                        <tr>
                            <td>${orderDTO.orderId}<br></td>
                            <td>${orderDTO.buyerName}</td>
                            <td>${orderDTO.buyerPhone}</td>
                            <td>${orderDTO.buyerAddress}</td>
                            <td>${orderDTO.orderAmount}</td>
                            <td>${orderDTO.orderStatusEnum.getMessage()}</td>
                            <td>${orderDTO.payStatusEnum.getMessage()}</td>
                            <td>${orderDTO.createTime}</td>
                            <td><a href="/sell/seller/order/detail?orderId=${orderDTO.orderId}">详情</a></td>
                            <td>
                                <#if  orderDTO.getOrderStatusEnum().message == "新订单">
                                    <a href="/sell/seller/order/cancel?orderId=${orderDTO.orderId}">取消</a>
                                </#if>
                            </td>
                        </tr>
                        </#list>
                            </tbody>
                        </table>
                    </div>
                </div>
            <#--分页-->
                <div class="col-md-12 column">
                    <ul class="pagination pull-right">
                    <#if currentPage lte 1>
                        <li class="disabled"><a href="#">上一页</a></li>
                    <#else>
                        <li><a href="/sell/seller/order/list?page=${currentPage-1}&size=${size}">上一页</a></li>
                    </#if>
                    <#list 1..orderDTOPage.getTotalPages() as index>
                        <#if currentPage == index>
                                <li class="disabled"><a href="#">${index}</a></li>
                        <#else>
                                <li><a href="/sell/seller/order/list?page=${index}&size=${size}">${index}</a></li>
                        </#if>
                    </#list>
                    <#if currentPage gte orderDTOPage.getTotalPages()>
                        <li class="disabled"><a href="#">下一页</a></li>
                    <#else>
                        <li><a href="/sell/seller/order/list?page=${currentPage+1}&size=${size}">下一页</a></li>
                    </#if>
                    </ul>
                </div>
            </div>
        </div>
    </div>

    <div class="modal fade" id="Mymodal" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
        <div class="modal-dialog">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
                    <h4 class="modal-title" id="myModalLabel">提醒</h4>
                </div>
                <div class="modal-body">
                    你有新的订单
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
                    <button type="button" onclick="location.reload()" class="btn btn-default" data-dismiss="modal">查看新的订单</button>
                </div>
            </div>
        </div>
    </div>
    <script src="http://libs.baidu.com/jquery/2.1.4/jquery.min.js"></script>
    <script src="http://libs.baidu.com/bootstrap/3.0.3/js/bootstrap.min.js"></script>
    <script>
        var websocket = null;
        if('WebSocket' in window){
            websocket = new WebSocket('ws://localhost:8080/sell/webSocket');
        }else{
            alert('Not support websocket')
        }
        websocket.onopen = function (ev) {
            console.log("建立连接");
        }
        websocket.onclose = function (ev) {
            console.log("关闭连接");
        }
        websocket.onmessage = function (ev) {
            console.log("收到信息:" + ev.data);
            $("#Mymodal").modal('show');

        }
        websocket.onerror = function (ev) {
            alert("webSocket通信发生错误");
        }
        window.onbeforeunload = function (ev) {
            websocket.close();
        }
    </script>
    </body>
</html>



