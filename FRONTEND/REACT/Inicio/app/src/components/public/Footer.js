import React, { useState, useSyncExternalStore } from "react";

export const Footer = () => {

  //const [clicks, setClicks] = useState(0); 

  const year = new Date().getFullYear();
  const companyName = "EGG Corporation";

  // const handleClick = () =>{
  //   setClicks(clicks + 1);
  // }

  return (
      <div class="container">
        <footer class="d-flex flex-wrap justify-content-between align-items-center py-3 my-4 border-top">
          <p class="col-md-4 mb-0 text-body-secondary">
            &copy; {year} {companyName} 
          </p>

          <a
            href="/"
            class="col-md-4 d-flex align-items-center justify-content-center mb-3 mb-md-0 me-md-auto link-body-emphasis text-decoration-none"
          >
            {/* <button type="button" onClick={handleClick}>Try</button> */}
            <img src="head_dog.png" className="App-logo"  />
            <svg class="bi me-2" width="40" height="32"></svg>
          </a>

          <ul class="nav col-md-4 justify-content-end">
            <li class="nav-item">
              <a href="#" class="nav-link px-2 text-body-secondary">
                Home
              </a>
            </li>
            <li class="nav-item">
              <a href="#" class="nav-link px-2 text-body-secondary">
                Features
              </a>
            </li>
            <li class="nav-item">
              <a href="#" class="nav-link px-2 text-body-secondary">
                Pricing
              </a>
            </li>
            <li class="nav-item">
              <a href="#" class="nav-link px-2 text-body-secondary">
                FAQs
              </a>
            </li>
            <li class="nav-item">
              <a href="#" class="nav-link px-2 text-body-secondary">
                About
              </a>
            </li>
          </ul>
        </footer>
      </div>
  );
};
