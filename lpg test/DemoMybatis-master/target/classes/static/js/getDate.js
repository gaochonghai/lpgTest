
$(function () {

    $.post({
        url:'user/list',
        success:function (data) {

               for(var i=0;i<data.length;i++){

                   var text="  <tr>\n" +
                       "            <th>"+data[i].state+"</th>\n" +
                       "            <th>"+data[i].username+"</th>\n" +
                       "            <th>"+data[i].createTime+"</th>\n" +
                       "            <td>\n" +
                       "                <a href=\"user/delById?id="+data[i].state+"\" class=\"btn btn-danger\">删除</a>\n" +
                       "                <a href=\"update.html?id="+data[i].state+"\" class=\"btn btn-success\">修改</a>\n" +
                       "            </td>\n" +
                       "        </tr>"
                  var obj= $(".pool");
                   obj.append(text);
               }
        }
    })
});