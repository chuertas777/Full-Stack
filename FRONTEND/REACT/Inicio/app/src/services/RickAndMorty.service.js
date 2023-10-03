import { API_RM } from "../constants/Api.constants";

class RickAndMortyService{
    async getAllCharacteres(){
        const response = await fetch(API_RM.CHARACTERS());
        //Interceptor
        return response.json();
    }

    async getAllCharacteresById(id){
        const response = await fetch(API_RM.CHARACTER_BY_ID(id));
        return response.json();
    }

}

export default new RickAndMortyService();