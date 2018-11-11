package person.search

import person.types.Person
import io.reactivex.Observable

interface PersonBackend {

    fun searchfor(searchFor: String): Observable<List<Person>>
}
