<script setup>
import { onMounted } from 'vue';
import useCommentStore from '@/store/useCommentStore';

let store = useCommentStore(); // 评论状态管理

// 当组件被挂载时再刷新评论
onMounted(() => {
    store.refresh();
});

</script>

<template>
    <ul>
        <li class="card" v-for="comment in store.comments">
            <div class="card-header">
                <div class="card-header-title">
                    {{ comment.id }}
                </div>
            </div>
            <div class="card-content" v-html="comment.content"></div>
        </li>
    </ul>
</template>
