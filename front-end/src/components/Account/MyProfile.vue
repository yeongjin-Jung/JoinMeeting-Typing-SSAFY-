<template>
  <div class="text-center" style="height: 100%">
    <v-dialog v-model="dialog" width="30%">
      <template v-slot:activator="{ on, attrs }">
          <v-btn text v-bind="attrs" v-on="on" class="mr-2" style="height: 100%; width:100%; outline:none;">
            <v-icon @click="initProfile" size="30">mdi-account</v-icon>
          </v-btn>
      </template>

      <v-card class="rounded">
        <MyProfileFacebook :profileFlag="profileFlag"/>
        <!-- <v-container>
          <v-row>
            <v-col cols="4">
              <v-avatar class="profile"  size="164" tile>
                <img :src="'http://joinmeeting.tk/images/'+this.$store.state.myPicture" alt="사진 자리 ㅠㅠ">
              </v-avatar>
            </v-col>
            <v-spacer></v-spacer>
            <v-col cols="7">
              Name: {{this.$store.state.myName}}
              <hr/>
              userId: {{this.$store.state.userId}}
            </v-col>
          </v-row>
        </v-container>        
        <v-divider></v-divider>
        <v-card-actions>
          <v-spacer></v-spacer>
          <router-link to="/Profile">
            <v-btn color="primary" @click="dialog = false" text >
              Edit
            </v-btn>  
          </router-link>
          <v-btn color="danger" text @click="dialog = false">Close</v-btn>
        </v-card-actions> -->
      </v-card>
    </v-dialog>
  </div>
</template>

<script>
import MyProfileFacebook from './MyProfileFacebook.vue';

export default {
  name: 'MyProfile',
  data() {
    return {
      dialog: false,
      profileFlag: false,
    };
  },
  components: {
    MyProfileFacebook,
  },
  computed: {
  },
  methods: {
    initProfile() {
      this.profileFlag = !this.profileFlag;
    }
  }
};
</script>

<style scoped>
</style>