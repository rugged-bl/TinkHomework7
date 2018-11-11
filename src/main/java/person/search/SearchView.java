package person.search;

import io.reactivex.Observable;

public interface SearchView {

    Observable<String> onSearchTextchanged();
}
