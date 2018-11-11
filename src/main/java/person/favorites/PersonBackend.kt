package person.favorites

import person.types.PersonWithAddress
import io.reactivex.Observable

internal interface PersonBackend {
    fun loadAllPersons(): Observable<List<PersonWithAddress>>
}
