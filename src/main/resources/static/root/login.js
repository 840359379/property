layui.use(['form','layer'],
    function() {
        $ = layui.jquery;
        let form = layui.form(),
            layer = layui.layer;

        //监听提交
        form.on('submit(login)', function(data) {
            console.log(data.field)
            $.ajax({
                type: "GET",
                datatype: "JSON",
                data: data.field,
                url: "verification",
                success:function (res) {
                    if(res.code == 200) {
                        location.href = "../homepage/index"
                    }else {
                        layer.msg("登陆失败");
                    }
                }
            })
            return false;
        });
    });