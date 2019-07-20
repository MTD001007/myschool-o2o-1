$(function () {
    var $shopCategory = $("#categoryId");
    var $shopSubcategoryId = $("#subcategoryId");

    // $shopCategory.on("click",function () {
        $shopCategory.html("");
        $shopCategory.append($("<option value='0'>请选择</option>"));
        $.get("/shop/categories",function (data) {
                data.map(function (item) {
                    //向select标签中添加option
                    // alert(item.shopCategoryId+":"+item.shopCategoryName)
                    // var $optionEle=$("<option value=''></option>")
                    $shopCategory.append($("<option value='"+ item.shopCategoryId+"'>"+item.shopCategoryName+"</option>"))
                })

        })

    // })
    //二级分类
    $shopCategory.change(function () {
        $shopSubcategoryId.html("");
        var parentId = $shopCategory.val();
        $("option[value='"+parentId+"']").attr("selected","selected");
        // $(this).attr("selected","selected");
        // if($(this).find("option").val())
        // alert
        $.get("/shop/categories",{"parentId":parentId},function (data) {
            data.map(function (item) {
                //向select标签中添加option
                // alert(item.shopCategoryId+":"+item.shopCategoryName)
                // var $optionEle=$("<option value=''></option>")
                $shopSubcategoryId.append($("<option value='"+ item.shopCategoryId+"'>"+item.shopCategoryName+"</option>"))
            })
         })
    })

})