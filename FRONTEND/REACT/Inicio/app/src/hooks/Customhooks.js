import { useState } from "react";

export const useUserForm = (initialState = {}) => {

  const [form, setForm] = useState(initialState);

  const handleChanges = ({target}) =>{

    const {name, value} = target;

    // console.log("Target: ", target);
    // console.log("Name: " , name);
    // console.log("Value: " , value);

    setForm({
      ...form,
      [name]:value,

    });
  };
    return {
      form, 
      setForm, 
      handleChanges,
    };

};




