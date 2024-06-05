const calculateTip=(facture, note) => {
    if (note === "Terrible");//arr.splice(2, 1);
       pourboire=facture
    if (note === "Poor");
       pourboire=facture*0.05  

    if (note === "Good");

       pourboire=facture*0.1
    if (note === "Great");

       pourboire=facture*0.15
    if (note === "ExcellEnt");
       pourboire=facture*0.2
    if ((note != "ExcellEnt")&&(note != "Great")&&(note != "Good")&&(note != "Poor")&&(note != "Terrible"));
       pourboire=pourboire
       console.log("Rating not recognised") 


    return pourboire;



}

calculateTip(20, "ExcellEnt");
calculateTip(26.95, "goOd");

