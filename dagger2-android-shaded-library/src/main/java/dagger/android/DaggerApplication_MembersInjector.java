package dagger.android;

import javax.annotation.Generated;
import javax.inject.Provider2;

import dagger.MembersInjector2;
import dagger2.internal.InjectedFieldSignature;

@Generated(
        value = "dagger2.internal.codegen.ComponentProcessor",
        comments = "https://dagger.dev"
)
@SuppressWarnings({
        "unchecked",
        "rawtypes"
})
public final class DaggerApplication_MembersInjector implements MembersInjector2<DaggerApplication> {
    private final Provider2<DispatchingAndroidInjector<Object>> androidInjectorProvider;

    public DaggerApplication_MembersInjector(
            Provider2<DispatchingAndroidInjector<Object>> androidInjectorProvider) {
        this.androidInjectorProvider = androidInjectorProvider;
    }

    public static MembersInjector2<DaggerApplication> create(
            Provider2<DispatchingAndroidInjector<Object>> androidInjectorProvider) {
        return new DaggerApplication_MembersInjector(androidInjectorProvider);
    }

    @Override
    public void injectMembers(DaggerApplication instance) {
        injectAndroidInjector(instance, androidInjectorProvider.get());
    }

    @InjectedFieldSignature("dagger.android.DaggerApplication.androidInjector")
    public static void injectAndroidInjector(DaggerApplication instance,
                                             DispatchingAndroidInjector<Object> androidInjector) {
        instance.androidInjector = androidInjector;
    }
}
