function DateFormater(props){
    let b;
   let f;
    let qw;
    
    let qw2;

    let qw1;
    let ab;
    console.log("Ad");
    const month = props.date.toLocaleString("en-us",{month:'long'})
    const date = props.date.toLocaleString("en-us",{day:'2-digit'})
    return <span>{date} {month}</span>
}
export default DateFormater;
