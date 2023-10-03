import React from "react";
import { Link } from "react-router-dom";

export const Card = ({ mascota }) => {
  return (
    <div>
      <div className="col">
        <div className="card shadow-sm">
          <img
            className="bd-placeholder-img card-img-top"
            width="100%"
            src={mascota.image}
            alt="imagen"
          />
          
          <div className="card-body">
            <strong className="d-inline-block mb-2 text-sucess">
              {mascota.species}
            </strong>
            <h3 className="mb-0 text-dark ">{mascota.name}</h3>
            <p className="card-text">
              This is a wider card with supporting text below as a natural
              lead-in to additional content. This content is a little bit
              longer.
            </p>
            <div className="d-flex justify-content-between align-items-center">
              <div className="btn-group">
                <button
                  type="button"
                  className="btn btn-sm btn-outline-secondary"
                >
                  <Link to={`/details/${mascota.id}`} className="nav-link px-2 text-secondary">Detalle</Link>
                </button>
                <button
                  type="button"
                  className="btn btn-sm btn-outline-secondary"
                >
                  <Link to={"/user-form"} className="nav-link px-2 text-secondary">Edit</Link>
                </button>
              </div>
              <small className="text-body-secondary">9 mins</small>
            </div>
          </div>
        </div>
      </div>
    </div>
  );
};
