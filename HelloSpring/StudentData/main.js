$(function(){
  $.ajax({
    type:  'GET',
    url: 'http://localhost:8080/api/v1/person/',
    success: function(data){
    console.log('success',data);
  }
  });
});
