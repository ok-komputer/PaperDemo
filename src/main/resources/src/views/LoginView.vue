<script setup>
import axios from 'axios';
import { sha256 } from 'js-sha256';
import { ref } from 'vue';
let username = ref();
let password = ref();

function submit() {
    console.log(`Login: username: ${ username.value }, password: ${ password.value }`);
    axios.post('/api/login', {
        username: username.value,
        passwordHash: sha256(password.value)
    })
}
</script>

<template>
    <h1 class="title">Login</h1>
    <div class="field">
        <div class="control">
            <label for="username" class="label">用户名</label>
            <input type="text" name="username" class="input" v-model="username">
        </div>
    </div>
    <div class="field">
        <div class="control">
            <label for="password" class="label">密码</label>
            <input type="password" name="password" class="input" v-model="password">
        </div>
    </div>
    <div class="field">
        <div class="control">
            <button class="button is-primary" @click="submit">登录</button>
        </div>
    </div>
</template>
