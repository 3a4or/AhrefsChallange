package androidx.databinding;

public class DataBinderMapperImpl extends MergedDataBinderMapper {
  DataBinderMapperImpl() {
    addMapper(new net.ahrefs.ahrefschallange.DataBinderMapperImpl());
  }
}
