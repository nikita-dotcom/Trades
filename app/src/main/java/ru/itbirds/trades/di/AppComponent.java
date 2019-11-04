package ru.itbirds.trades.di;

import javax.inject.Singleton;

import dagger.Component;
import ru.itbirds.trades.ui.ChartFragment;
import ru.itbirds.trades.ui.PageFragment;
import ru.itbirds.trades.ui.TopTenFragment;

@Singleton
@Component(modules = {AppModule.class, NetworkModule.class, RepositoryModule.class})
public interface AppComponent {
    void inject(ChartFragment fragment);

    void inject(TopTenFragment fragment);

    void inject(PageFragment fragment);
}
