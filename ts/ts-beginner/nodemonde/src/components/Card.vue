<script setup lang="ts">
defineProps<{
  name: string;
  image: string;
  tldList: string[];
}>();
</script>

<template>
  <article>
    <picture>
      <img :src="image" alt="flag" />
    </picture>
    <div>
      <h2>{{ name }}</h2>
      <dl>
        <dt>top-level domains</dt>
        <dd v-for="fld in tldList">
          {{ tld }}
        </dd>
      </dl>
    </div>
  </article>
</template>

