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
public final class DaggerFragment_MembersInjector implements MembersInjector2<DaggerFragment> {
  private final Provider2<DispatchingAndroidInjector<Object>> androidInjectorProvider;

  public DaggerFragment_MembersInjector(
      Provider2<DispatchingAndroidInjector<Object>> androidInjectorProvider) {
    this.androidInjectorProvider = androidInjectorProvider;
  }

  public static MembersInjector2<DaggerFragment> create(
      Provider2<DispatchingAndroidInjector<Object>> androidInjectorProvider) {
    return new DaggerFragment_MembersInjector(androidInjectorProvider);}

  @Override
  public void injectMembers(DaggerFragment instance) {
    injectAndroidInjector(instance, androidInjectorProvider.get());
  }

  @InjectedFieldSignature("dagger.android.support.DaggerFragment.androidInjector")
  public static void injectAndroidInjector(DaggerFragment instance,
      DispatchingAndroidInjector<Object> androidInjector) {
    instance.androidInjector = androidInjector;
  }
}
