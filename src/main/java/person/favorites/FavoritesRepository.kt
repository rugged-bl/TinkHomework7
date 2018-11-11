package person.favorites

import io.reactivex.Observable
import io.reactivex.rxkotlin.withLatestFrom
import person.types.PersonWithAddress

internal class FavoritesRepository(private val personBackend: PersonBackend, private val favoritesDatabase: FavoritesDatabase) {


    fun loadFavorites(): Observable<List<PersonWithAddress>> {

        /**
         * Provide an observable that only emits a list of PersonWithAddress if they are marked as favorite ones.
         */

        return favoritesDatabase.favoriteContacts()
                .withLatestFrom(personBackend.loadAllPersons()) { t1, t2 -> Pair(t1, t2) }
                .map { p -> p.second.filter { p.first.contains(it.person.id) } }

    }
}
