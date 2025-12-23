
<script setup>
import axios from 'axios';
import { ref } from 'vue';
import useCommentStore from '@/store/useCommentStore';

let content = ref(); // 评论的内容
let store = useCommentStore(); // 评论状态管理

// 发送评论
function sendComment() {
    // 使用 axios 库发送 POST 请求
    axios.post('/api/comment/new', {
        content: content.value
    }).then(() => {
        store.refresh(); // 刷新评论展示
    });
}

</script>

<template>
    <div class="field has-addons">
        <div class="control">
            <input type="text" class="input" v-model="content">
        </div>
        <div class="control">
            <button class="button" @click="sendComment">发送</button>
        </div>
    </div>
</template>
