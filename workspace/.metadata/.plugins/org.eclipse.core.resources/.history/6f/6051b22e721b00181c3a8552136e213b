/**
 * 
 */
function getData(){
var APIKEY = "1f39dea1e4239caa8c1ae2c4975e9926";
var baseURL="https://api.themoviedb.org/3/";
/*let url="".concat(baseURL,'configuration?api_key=',APIKEY);
fetch(url)
.then((result)=>{
    console.log("hello");
    return result.json();
})
.then((data)=>{
    console.log('in console');
    var movie = document.getElementById('name').value;
    runSearch(movie);
})
}

let runSearch=function(keyword){*/
	var movie = document.getElementById('name').value;
	alert();

    let url=''.concat('https://api.themoviedb.org/3/','search/movie?api_key=','1f39dea1e4239caa8c1ae2c4975e9926','&query=',movie);
    fetch(url)
    .then(result=>result.json())
    .then((data)=>{
    	
        document.getElementById('output').innerHTML=renderSearch(data);
        console.log(data);
    })
    
}
let renderSearch=function(data){
	alert();
	 var htmlText = '';
	 
var count=data.results.length;
console.log(count );
console.log()
     for ( var i=0;i<data.results.length;i++ ) {
    	 console.log(data.results[i].title);
         htmlText += '<div class="div-conatiner">';
         htmlText += '<div class="col_sm_4">';
         htmlText += '<p class="p-name"> Name: ' + data.results[i].title + '</p>';
         htmlText += '<p class="p-loc"> Location: ' + data.results[i].poster_path + '</p>';
         htmlText += '<p class="p-desc"> Description: ' + data.results[i].overview + '</p>';
         htmlText += '<p class="p-created"> Created by: ' + data.results[i].release_date + '</p>';
        
         htmlText += '</div>';
         htmlText += '<a href="link.jsp">';
         htmlText += '<input type="button" value="Visit Page" />';
         htmlText += '</a>';
         //htmlText += '<button onClick=incount() >Add to favourites</button>';
         //htmlText += '<script type="text/javascript" src="function1.jsp"></script>';
         
         htmlText += '<hr>';
     }
//$('body').append(htmlText);
//console.log(htmlText);
document.getElementById('output').insertAdjacentHTML('afterend',htmlText);
}