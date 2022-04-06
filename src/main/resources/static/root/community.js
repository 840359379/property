layui.use(['laydate','element','laypage','layer'], function(){
    $ = layui.jquery;//jquery
    laydate = layui.laydate;//日期插件
    lement = layui.element();//面包导航
    laypage = layui.laypage;//分页
    layer = layui.layer;//弹出层
    okLoading.close($);
    //以上模块根据需要引入

    layer.ready(function(){ //为了layer.ext.js加载完毕再执行
        layer.photos({
            photos: '#x-img'
            //,shift: 5 //0-6的选择，指定弹出图片动画类型，默认随机
        });
    });

    var start = {
        min: laydate.now()
        ,max: '2099-06-16 23:59:59'
        ,istoday: false
        ,choose: function(datas){
            end.min = datas; //开始日选好后，重置结束日的最小日期
            end.start = datas //将结束日的初始值设定为开始日
        }
    };

    var end = {
        min: laydate.now()
        ,max: '2099-06-16 23:59:59'
        ,istoday: false
        ,choose: function(datas){
            start.max = datas; //结束日选好后，重置开始日的最大日期
        }
    };

    document.getElementById('LAY_demorange_s').onclick = function(){
        start.elem = this;
        laydate(start);
    }
    document.getElementById('LAY_demorange_e').onclick = function(){
        end.elem = this
        laydate(end);
    }

});

/*添加*/
function adminAdd(title,url,w,h){
    x_admin_show(title,url,w,h);
}

/*停用*/
function admin_stop(obj,id){
    layer.confirm('确认要停用吗？',function(index){
        //发异步把用户状态进行更改
        $(obj).parents("tr").find(".td-manage").prepend('<a style="text-decoration:none" onClick="admin_start(this,id)" href="javascript:;" title="启用"><i class="layui-icon">&#xe62f;</i></a>');
        $(obj).parents("tr").find(".td-status").html('<span class="layui-btn layui-btn-disabled layui-btn-mini">已停用</span>');
        $(obj).remove();
        layer.msg('已停用!',{icon: 5,time:1000});
    });
}

/*启用*/
function admin_start(obj,id){
    layer.confirm('确认要启用吗？',function(index){
        //发异步把用户状态进行更改
        $(obj).parents("tr").find(".td-manage").prepend('<a style="text-decoration:none" onClick="admin_stop(this,id)" href="javascript:;" title="停用"><i class="layui-icon">&#xe601;</i></a>');
        $(obj).parents("tr").find(".td-status").html('<span class="layui-btn layui-btn-normal layui-btn-mini">已启用</span>');
        $(obj).remove();
        layer.msg('已启用!',{icon: 6,time:1000});
    });
}
//编辑
function community_edit (me,title,url,id,w,h) {
    url = url+"?id="+me.name;
    x_admin_show(title,url,w,h);
}
/*删除*/
function admin_del(obj,id){
    layer.confirm('确认要删除吗？',{icon:3,title:'提示信息'},function(index){
        $.ajax({
            type:"get",
            url:"/community/delete",
            data:{id:id},
            dataType:"json",
            success:function(data){
                if(data.code == 200){
                    //发异步删除数据
                    $(obj).parents("tr").remove();
                    layer.msg(data.message,{icon:6,time:1000}); setTimeout(function(){
                        window.location.reload();
                    },1000);return false;
                } else{
                    layer.msg(data.message,{icon:5,time:1000});return false;
                }
            }
        });
        //发异步删除数据
        $(obj).parents("tr").remove();
        layer.msg('已删除!',{icon:1,time:1000});
    });
}

function start(obj,id,e){
    console.log(obj)
    layer.confirm(e==1?'确定要使用吗？':'确定要闲置吗？',{icon: 3, title:'提示'},function(index){
        $.ajax({
            type:"post",
            url:"xxx",
            data:{id:id,status:e},
            dataType:"json",
            success:function(data)
            {
                if(data.status==1){
                    //发异步把用户状态进行更改
                    $(obj).attr("class","layui-btn layui-btn-danger ");
                    $(obj).text("隐藏");
                    $(obj).remove();
                    layer.msg(data.info,{icon: 6,time:1000});
                    setTimeout(function(){
                        window.location.reload();
                    },1000);return false;
                }else{
                    //发异步把用户状态进行更改
                    $(obj).attr("class","layui-btn layui-btn-normal ");
                    $(obj).text("显示");
                    $(obj).remove();
                    layer.msg(data.info,{icon: 5,time:1000});return false;
                }
            }
        });

    });
}
