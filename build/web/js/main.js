function clickBottom(id){

  window.alert ("click "+id);
  $.post("RegistraClick",
  {
      id:id
  },
  function(){});
}
