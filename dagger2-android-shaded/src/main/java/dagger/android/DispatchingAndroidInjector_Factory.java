package dagger.android;

import java.util.Map;

import javax.annotation.Generated;
import javax.inject.Provider2;

import dagger2.internal.Factory;

@Generated(
        value = "dagger.internal.codegen.ComponentProcessor",
        comments = "https://dagger.dev"
)
@SuppressWarnings({
        "unchecked",
        "rawtypes"
})
public final class DispatchingAndroidInjector_Factory<T> implements Factory<DispatchingAndroidInjector<T>> {
    private final Provider2<Map<Class<?>, Provider2<AndroidInjector.Factory<?>>>> injectorFactoriesWithClassKeysProvider;

    private final Provider2<Map<String, Provider2<AndroidInjector.Factory<?>>>> injectorFactoriesWithStringKeysProvider;

    public DispatchingAndroidInjector_Factory(
            Provider2<Map<Class<?>, Provider2<AndroidInjector.Factory<?>>>> injectorFactoriesWithClassKeysProvider,
            Provider2<Map<String, Provider2<AndroidInjector.Factory<?>>>> injectorFactoriesWithStringKeysProvider) {
        this.injectorFactoriesWithClassKeysProvider = injectorFactoriesWithClassKeysProvider;
        this.injectorFactoriesWithStringKeysProvider = injectorFactoriesWithStringKeysProvider;
    }

    @Override
    public DispatchingAndroidInjector<T> get() {
        return newInstance(injectorFactoriesWithClassKeysProvider.get(), injectorFactoriesWithStringKeysProvider.get());
    }

    public static <T> DispatchingAndroidInjector_Factory<T> create(
            Provider2<Map<Class<?>, Provider2<AndroidInjector.Factory<?>>>> injectorFactoriesWithClassKeysProvider,
            Provider2<Map<String, Provider2<AndroidInjector.Factory<?>>>> injectorFactoriesWithStringKeysProvider) {
        return new DispatchingAndroidInjector_Factory<T>(injectorFactoriesWithClassKeysProvider, injectorFactoriesWithStringKeysProvider);
    }

    public static <T> DispatchingAndroidInjector<T> newInstance(
            Map<Class<?>, Provider2<AndroidInjector.Factory<?>>> injectorFactoriesWithClassKeys,
            Map<String, Provider2<AndroidInjector.Factory<?>>> injectorFactoriesWithStringKeys) {
        return new DispatchingAndroidInjector<T>(injectorFactoriesWithClassKeys, injectorFactoriesWithStringKeys);
    }
}
