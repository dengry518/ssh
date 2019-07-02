new Vue({
    el: '#app',
    data: {
        userList: [],
        user: {}
    },
    methods: {
        getUserList: function () {
            var _this = this;
            axios.get("/user/list.do")
                .then(function (response) {
                    _this.userList = response.data;
                })
        },
        edit: function (id) {
            $('#myModal').modal('show');

            var _this = this;
            axios.get("/user/" + id + ".do")
                .then(function (response) {
                    _this.user = response.data;
                })
        }
    },
    created: function () {
        this.getUserList();
    }
});