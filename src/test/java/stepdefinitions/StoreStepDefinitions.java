package stepdefinitions;

import cucumber.api.java.es.*;

import java.util.List;

public class StoreStepDefinitions {
    @Dado("^que un cliente accede hasta la tienda web$")
    public void queUnClienteAccedeHastaLaTiendaWeb() {
        // Write code here that turns the phrase above into concrete actions

    }

    @Cuando("^agrega lo articulos al carrito$")
    public void agregaLosArticulosAlCarrito() {
        // Write code here that turns the phrase above into concrete actions

    }

    @Entonces("^puede ver la lista de articulos en el carrito$")
    public void puedeVerLaListaDeArticulosEnElCarrito() {
        // Write code here that turns the phrase above into concrete actions

    }

    @Cuando("^agrega lo articulos al carrito$")
    public void agregaLosArticulosAlCarrito(List<String> datos) {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
        // E,K,V must be a scalar (String, Integer, Date, enum etc).
        // Field names for YourType must match the column names in
        // your feature file (except for spaces and capitalization).

    }
}
