while (!quaiAEstVide()) {
  if (!navetteEstPleine()) { 
    faireMonterPassager();
  } if(
    navetteEstPleine() || quaiAEstVide
  ) {
    transporter();
  }

}
  