<script setup lang="ts">
  import { ref } from "vue";
  import Card from "./components/Card.vue";

  const input = ref("");
  const countries = ref();

  async function fetchCountries() {
    const response = await fetch(`https://restcountries.com/v3.1/name/${input.value}`);
    const data = await response.json();
    countries.value = data;
  }

</script>

<template>
  <h1>Country Info</h1>

  <form @submmit.prevent="fetchCountries">
    <input v-model="input" placeholder="country name" />
    <button type="button" @click="fetchCountries">Fetch</button>
  </form>
  
  <Card
      v-for="country in countries"
      :key="country.name.common"
      :name="country.name.common"
      :image="country.flags.png"
      :tldList="country.tld"
      />
</template>

<style scoped>
article {
  display: flex;
  text-align: left;
  padding: 2rem;
  gap: 1rem;
  background-color: lightskyblue;
  border-radius: 1rem;
  margin-top: 2rem;
}
</style>
