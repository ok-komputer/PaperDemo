<template>
    <header class="navbar">
        <div class="navbar-brand">
            <span class="navbar-item">评论系统</span>
        </div>

        <div class="navbar-menu">
            <div class="navbar-start">
                <RouterLink to="/" class="navbar-item">主页</RouterLink>
            </div>
            <div class="navbar-end">
                <div class="navbar-item">
                    <RouterLink to="/login" class="button is-primary">登录</RouterLink>
                </div>
            </div>
        </div>
    </header>
</template>