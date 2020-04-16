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
public final class DaggerAppCompatActivity_MembersInjector implements MembersInjector2<DaggerAppCompatActivity> {
  private final Provider2<DispatchingAndroidInjector<Object>> androidInjectorProvider;

  public DaggerAppCompatActivity_MembersInjector(
      Provider2<DispatchingAndroidInjector<Object>> androidInjectorProvider) {
    this.androidInjectorProvider = androidInjectorProvider;
  }

  public static MembersInjector2<DaggerAppCompatActivity> create(
      Provider2<DispatchingAndroidInjector<Object>> androidInjectorProvider) {
    return new DaggerAppCompatActivity_MembersInjector(androidInjectorProvider);}

  @Override
  public void injectMembers(DaggerAppCompatActivity instance) {
    injectAndroidInjector(instance, androidInjectorProvider.get());
  }

  @InjectedFieldSignature("dagger.android.support.DaggerAppCompatActivity.androidInjector")
  public static void injectAndroidInjector(DaggerAppCompatActivity instance,
      DispatchingAndroidInjector<Object> androidInjector) {
    instance.androidInjector = androidInjector;
  }
}
