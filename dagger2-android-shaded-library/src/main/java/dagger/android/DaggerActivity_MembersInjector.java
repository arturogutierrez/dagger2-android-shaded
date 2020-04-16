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
public final class DaggerActivity_MembersInjector implements MembersInjector2<DaggerActivity> {
    private final Provider2<DispatchingAndroidInjector<Object>> androidInjectorProvider;

    public DaggerActivity_MembersInjector(
            Provider2<DispatchingAndroidInjector<Object>> androidInjectorProvider) {
        this.androidInjectorProvider = androidInjectorProvider;
    }

    public static MembersInjector2<DaggerActivity> create(
            Provider2<DispatchingAndroidInjector<Object>> androidInjectorProvider) {
        return new DaggerActivity_MembersInjector(androidInjectorProvider);
    }

    @Override
    public void injectMembers(DaggerActivity instance) {
        injectAndroidInjector(instance, androidInjectorProvider.get());
    }

    @InjectedFieldSignature("dagger.android.DaggerActivity.androidInjector")
    public static void injectAndroidInjector(DaggerActivity instance,
                                             DispatchingAndroidInjector<Object> androidInjector) {
        instance.androidInjector = androidInjector;
    }
}
