import React, { useEffect, useState } from "react";
import { Card } from "./Card";
import RickAndMortyService from "../../services/RickAndMorty.service";

export const Cards = () => {

  const [mascotas, setmascotas] = useState([]);

  useEffect(() => {
    RickAndMortyService.getAllCharacteres()
      .then((data) => setmascotas(data.results))
      .catch((error) => console.log(error));
  }, [mascotas])
  
  const cardList = mascotas.map((m) => <Card mascota={m} key={m.id} />);
  return (
    <div>
      <div className="album py-5 bg-body-tertiary">
        <div className="container">
          <div className="row row-cols-1 row-cols-sm-2 row-cols-md-3 g-3">
            {cardList}
          </div>
        </div>
      </div>
    </div>
  );
};
