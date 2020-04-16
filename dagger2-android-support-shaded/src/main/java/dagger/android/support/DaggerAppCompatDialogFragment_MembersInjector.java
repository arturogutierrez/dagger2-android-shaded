package dagger.android.support;

import dagger.MembersInjector2;
import dagger.android.DispatchingAndroidInjector;
import dagger2.internal.InjectedFieldSignature;
import javax.annotation.Generated;
import javax.inject.Provider2;

@Generated(
    value = "dagger2.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DaggerAppCompatDialogFragment_MembersInjector implements MembersInjector2<DaggerAppCompatDialogFragment> {
  private final Provider2<DispatchingAndroidInjector<Object>> androidInjectorProvider;

  public DaggerAppCompatDialogFragment_MembersInjector(
      Provider2<DispatchingAndroidInjector<Object>> androidInjectorProvider) {
    this.androidInjectorProvider = androidInjectorProvider;
  }

  public static MembersInjector2<DaggerAppCompatDialogFragment> create(
      Provider2<DispatchingAndroidInjector<Object>> androidInjectorProvider) {
    return new DaggerAppCompatDialogFragment_MembersInjector(androidInjectorProvider);}

  @Override
  public void injectMembers(DaggerAppCompatDialogFragment instance) {
    injectAndroidInjector(instance, androidInjectorProvider.get());
  }

  @InjectedFieldSignature("dagger.android.support.DaggerAppCompatDialogFragment.androidInjector")
  public static void injectAndroidInjector(DaggerAppCompatDialogFragment instance,
      DispatchingAndroidInjector<Object> androidInjector) {
    instance.androidInjector = androidInjector;
  }
}
