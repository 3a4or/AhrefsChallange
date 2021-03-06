// Generated by Dagger (https://dagger.dev).
package net.ahrefs.ahrefschallange.ui.search;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;
import net.ahrefs.ahrefschallange.data.network.BaseRepository;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class SearchViewModel_Factory implements Factory<SearchViewModel> {
  private final Provider<BaseRepository> repoProvider;

  public SearchViewModel_Factory(Provider<BaseRepository> repoProvider) {
    this.repoProvider = repoProvider;
  }

  @Override
  public SearchViewModel get() {
    return newInstance(repoProvider.get());
  }

  public static SearchViewModel_Factory create(Provider<BaseRepository> repoProvider) {
    return new SearchViewModel_Factory(repoProvider);
  }

  public static SearchViewModel newInstance(BaseRepository repo) {
    return new SearchViewModel(repo);
  }
}
