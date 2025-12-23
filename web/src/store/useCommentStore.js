import { defineStore } from "pinia";
import axios from "axios";

let useCommentStore = defineStore('comment', {
    state: () => ({
        amount: 10,
        comments: []
    }),
    actions: {
        refresh() {
            let that = this;
            axios.get('/api/comment/comments', {
                params: { amount: this.amount }
            }).then((response) => {
                that.comments = response.data;
            })
        }
    }
});

export default useCommentStore;