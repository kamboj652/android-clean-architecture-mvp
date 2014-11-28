package cat.ppicas.cleanarch.ui.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import cat.ppicas.cleanarch.R;
import cat.ppicas.cleanarch.domain.City;
import cat.ppicas.cleanarch.ui.adapter.display.CityListItemDisplayAdapter;
import cat.ppicas.cleanarch.ui.presenter.CityListItemPresenter;

public class CityAdapter extends ArrayAdapter<City> {

    private final LayoutInflater mInflater;

    public CityAdapter(Context context) {
        super(context, android.R.layout.simple_list_item_1);
        mInflater = LayoutInflater.from(context);
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {
        // Initialize the class to adapt the View to CityListItemDisplay interface
        CityListItemDisplayAdapter displayAdapter;
        if (view == null) {
            view = mInflater.inflate(R.layout.view_city_list_item, parent, false);
            displayAdapter = new CityListItemDisplayAdapter(view);
            view.setTag(R.id.global__view_adapter, displayAdapter);
        } else {
            displayAdapter = (CityListItemDisplayAdapter) view.getTag(R.id.global__view_adapter);
        }

        City city = getItem(position);

        // Initialize or reconfigures a Presenter for CityListItemView
        CityListItemPresenter presenter = (CityListItemPresenter) view.getTag(
                R.id.global__view_presenter);
        if (presenter == null) {
            presenter = new CityListItemPresenter(city);
            presenter.bindDisplay(displayAdapter);
            view.setTag(R.id.global__view_presenter, presenter);
        } else if (!presenter.getCityId().equals(city.getId())) {
            presenter.setCity(city);
        }

        return view;
    }
}
