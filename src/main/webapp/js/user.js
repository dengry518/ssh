new Vue({
    el: '#app',
    data: {
        userList: []
    },
    methods: {
        getUserList: function () {
            var _this = this;
            axios.get("/user/list.do")
                .then(function (response) {
                    _this.userList = response.data;
                })
        }
    },
    created: function () {
        this.getUserList();
    }
});