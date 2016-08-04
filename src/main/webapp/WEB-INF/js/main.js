/**
 * Created by sanze on 2016/8/2.
 */
easyloader.locale = "zh_CN";
easyloader.theme = "metro-blue";

using("tabs", function () {
    var tabs = $("#home_tabs").tabs({
        plain: true,
        border: false,
        fit: true,
        onSelect: function (title, index) {
            var target = this;
            var tab = $(target).tabs('getTab', index);
            tab.css('padding', '10px 0');
            tab.panel({
                href:"crm",
                onLoad:function () {
                    using("../../js/test.js", function () {

                    });
                }
            });
        }
    });
});

// using("../../js/test.js", function () {
//     CRM.init();
//     // $("#btnAlert").on('click', function () {
//     //     Test.show();
//     // });
// });