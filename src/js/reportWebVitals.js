const reportWebVitals = onPerfEntry => {
  if (onPerfEntry && onPerfEntry instanceof Function) {
    import('web-vitals').then(({ getCLS, getFID, getFCP, getLCP, getTTFB }) => {
      getCLS(onPerfEntry);
      getFID(onPerfEntry);
      getFCP(onPerfEntry);
      getLCP(onPerfEntry);
      getTTFB(onPerfEntry);
    });
  }
};

function abc2(){
  let a;
  console.log(2);
  console.log("233")
}
export default reportWebVitals;

function asdasd(){
  console.log("233")
  console.log("233")
  console.log("233")
  console.log(11);
}
