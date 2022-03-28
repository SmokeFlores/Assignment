import React,{useState} from 'react' //ShortCut rafce
import "./App.css"
import data from "./mock-data.json";
 const App =() => {
   const [contacts,setContacts]=useState(data);
   return(
     <div className='app-container'>
   <table>
     <thead>
     <tr>
       <th>Name</th>
       <th>Job</th>
    
     </tr>
     </thead>
     <tbody>
     {contacts.map((contacts)=>(
       <tr>
       <td>{contacts.name}</td>
       <td>{contacts.Job}</td>
       
      </tr>
      ))}
  
     </tbody>

   </table>
   </div>
   );
 };






export default App;
