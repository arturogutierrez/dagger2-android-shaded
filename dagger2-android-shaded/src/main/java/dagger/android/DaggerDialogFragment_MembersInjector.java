package dagger.android;

import javax.annotation.Generated;
import javax.inject.Provider2;

import dagger.MembersInjector2;
import dagger2.internal.InjectedFieldSignature;

@Generated(
        value = "dagger.internal.codegen.ComponentProcessor",
        comments = "https://dagger.dev"
)
@SuppressWarnings({
        "unchecked",
        "rawtypes"
})
public final class DaggerDialogFragment_MembersInjector implements MembersInjector2<DaggerDialogFragment> {
    private final Provider2<DispatchingAndroidInjector<Object>> androidInjectorProvider;

    public DaggerDialogFragment_MembersInjector(
            Provider2<DispatchingAndroidInjector<Object>> androidInjectorProvider) {
        this.androidInjectorProvider = androidInjectorProvider;
    }

    public static MembersInjector2<DaggerDialogFragment> create(
            Provider2<DispatchingAndroidInjector<Object>> androidInjectorProvider) {
        return new DaggerDialogFragment_MembersInjector(androidInjectorProvider);
    }

    @Override
    public void injectMembers(DaggerDialogFragment instance) {
        injectAndroidInjector(instance, androidInjectorProvider.get());
    }

    @InjectedFieldSignature("dagger.android.DaggerDialogFragment.androidInjector")
    public static void injectAndroidInjector(DaggerDialogFragment instance,
                                             DispatchingAndroidInjector<Object> androidInjector) {
        instance.androidInjector = androidInjector;
    }
}
