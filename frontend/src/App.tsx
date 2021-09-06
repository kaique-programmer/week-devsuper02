import Navbar from "components/Navbar";
import DataTable from "components/Datatable";
import Footer from "components/Footer";

function App() {
  return (
    <>
      <Navbar />
      <div className="container">
        <DataTable />
      </div>
      <Footer />
    </>
  );
}

export default App;
