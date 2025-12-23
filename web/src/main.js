import 'bulma/css/bulma.min.css';
import { createApp } from 'vue';
import { createWebHashHistory, createRouter } from 'vue-router';
import pinia from './store';
import App from './App.vue';
import IndexView from './views/IndexView.vue';
import LoginView from './views/LoginView.vue';

const routes = [
    { path: '/', component: IndexView },
    { path: '/login', component: LoginView },
]

const router = createRouter({
    history: createWebHashHistory(),
    routes,
})


createApp(App).use(router).use(pinia).mount('#app');
