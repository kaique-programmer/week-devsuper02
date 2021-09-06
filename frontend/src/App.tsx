import Navbar from "components/Navbar";
import DataTable from "components/Datatable";
import Footer from "components/Footer";
import Barchart from "components/Barchart";
import Donutchart from "components/Donutchart";

function App() {
  return (
    <>
      <Navbar />
      <div className="container">
        <h1 className="text-primary py-3">Dahsboard de vendas</h1>

        <div className="row px-3">
          <div className="col-sm-6">
            <h5 className="text-center text-secundary">Taxa de sucesso(%)</h5>
            <Barchart />
          </div>
          <div className="col-sm-6">
            <h5 className="text-center text-secundary">Todas vendas</h5>
            <Donutchart />
          </div>
        </div>

        <div className="py-3">
          <h2 className="text-primary">
            Todas as vendas
          </h2>
        </div>
        <DataTable />
      </div>
      <Footer />
    </>
  );
}

export default App;
